package section08_DFS_BFS;

import java.util.Scanner;

public class P09 { // 8-9 조합 구하기
	
	static int[] combi;
	static int n, m;
	
	public void DFS(int L, int s) {
		if(L==m) {
			for(int x : combi) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for(int i=s; i<=n; i++) { // s부터 (넘어온 숫자부터)
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		P09 T = new P09();
		Scanner sc = new Scanner(System.in);
		
		n=sc.nextInt(); // n개의 구슬
		m=sc.nextInt(); // m개 뽑기
		
		combi = new int[m];
		T.DFS(0, 1);
	}
	

}
