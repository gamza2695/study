package section07_Recursive_Tree_Graph;

import java.util.Scanner;

public class P04 { // 7-4 피보나치 재귀(메모이제이션)
	
	// 시간 줄이기 위한 fibo 배열 선언
	static int[] fibo;
	
	
	public static int DFS(int n) {
		
		// 메모이제이션 활용해서 시간복잡도 줄이기
		// 이미 기록해 놓은 배열값을 리턴한다
		if(fibo[n]>0) return fibo[n];
		
		if(n==1) return fibo[n]=1;
		else if(n==2) return fibo[n]=1;
		else return fibo[n] = DFS(n-2) + DFS(n-1);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		
		
		fibo = new int[n+1];
		
		DFS(n);
		
		for(int i = 1; i<=n; i++) {
			System.out.print(fibo[i] + " ");
		}
		
		
	}

}
