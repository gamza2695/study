package section08_DFS_BFS;

import java.util.Scanner;

public class P01 { // 8-1 합이 같은 부분집합
	
	static String answer = "NO";
	static int n, total=0;
	boolean flag = false;
	
	public void DFS(int L, int sum, int[] arr) {
		if(L==n) {
			if(flag) return; // 쌓인 스택들 계속 리턴
			
			if(sum>total/2) return;
			
			if((total-sum) == sum) {
				answer = "YES";
				flag = true;
			}
		}
		else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
		
	}
	
	public static void main(String[] args) {
		P01 T = new P01();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			total+=arr[i];
		}
		
		T.DFS(0, 0, arr);
		System.out.println(answer);
		
	}
	

}
