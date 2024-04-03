package section08_DFS_BFS;

import java.util.Scanner;

public class P07 { // 8-7 조합의 경우수(메모이제이션)
	
	// 메모이제이션 사용해서 시간복잡도 줄이기
	int[][] dy = new int[35][35];
	
	public int DFS(int n, int r) { // nCr 구하기
		
		if(dy[n][r] > 0) return dy[n][r]; // 이미 구한 값 리턴
		if(n==r || r==0) return 1; // nC0이거나 nCn이면 끝 리턴1
		else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1,r);
		
	}
	
	public static void main(String[] args) {
		P07 T = new P07();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		System.out.println(T.DFS(n, r));
	}
	

}
