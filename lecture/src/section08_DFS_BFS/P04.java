package section08_DFS_BFS;

import java.util.Scanner;

public class P04 { // 8-4 중복순열
	
	static int[] pm;
	static int n, m;
	
	public void DFS(int L) {
		
		if(L==m) { // m번 모두 뽑았을 때
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		}
		else {
			for(int i=1; i<=n; i++) { // 구슬 n개
				pm[L] = i;
				DFS(L+1); // n번의 호출 일어난다, n가닥 뻗어간다
				
			}
		}
	}
	
	public static void main(String[] args) {
		P04 T =new P04();
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		pm = new int[m];
		T.DFS(0);
	}
}
