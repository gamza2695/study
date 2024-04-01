package section08_DFS_BFS;

import java.util.Scanner;

public class P02 { // 8-2 바둑이 승차
	
	static int answer = Integer.MIN_VALUE, c, n;
	
	public void DFS(int L, int sum, int[] arr) {
		
		if(sum>c) return;
		if(L==n) {
			answer = Math.max(answer, sum);
		}
		else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
		
	}
	
	public static void main(String[] args) {
		P02 T = new P02();
		Scanner sc = new Scanner(System.in);
		
		c = sc.nextInt();
		n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		T.DFS(0, 0, arr);
		System.out.println(answer);
	}

}
