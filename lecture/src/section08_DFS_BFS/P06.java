package section08_DFS_BFS;

import java.util.Scanner;

public class P06 { // 8-6 순열 구하기
	static int[] pm, ch, arr;
	static int n,m;
	
	public void DFS(int L) {
		if(L==m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
			
		}
		else {
			for(int i=0; i<n; i++) {
				if(ch[i]==0) {
					ch[i] = 1; // 사용 o 체크
					pm[L] = arr[i];
					DFS(L+1);
					ch[i] = 0; // 돌아왔을 때 체크 풀기
				}
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		P06 T = new P06();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 자연수 개수
		m = sc.nextInt(); // 뽑는 개수
		arr = new int[n]; // 자연수 넣기
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		ch = new int[n];
		pm = new int[m];
		T.DFS(0);
		
	}
	

}
