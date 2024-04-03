package section08_DFS_BFS;

import java.util.Scanner;

public class P08 { // 8-8 수열 추측하기 // 출력이 안됨...왜지?ㅜ
	
	static int[] b, p, ch; // 콤비네이션 값, 순열, 체크 배열
	static int n,f; // n, 마지막 숫자

	boolean flag = false; // 마지막 숫자를 구하는 DFS가 POP 된 후 stack에 남아있는 DFS를 바로 종료시키기 위한 flag 
	
	// 메모이제이션
	int[][] dy = new int[35][35];
	
	public int combi(int n, int r) { // 조합 구하기
		if(dy[n][r]>0) return dy[n][r];
		if(n==r||r==0) return 1;
		else return dy[n][r] = combi(n-1, r-1) + combi(n-1,r);
	}

	public void DFS(int L, int sum) {
		
		if(flag) return; // flag가 true이면 아래 DFS로 못가게 바로바로 return 후 프로그램 종료
		
		if(L==n) { // 순열 p 완성됐을 때
			if(sum==f) { // sum이 마지막 숫자라면
				for(int x : p) {
					System.out.print(x+" ");
				}
				flag = true;
			}
			
		}
		else {
			for(int i=1; i<n; i++) {
				if(ch[i]==0) { // i 사용하지 않았으면
					ch[i]=1; // 체크
					p[L] = i;
					DFS(L+1, sum+(p[L]*b[L]));
					ch[i]=0; // 체크 풀기
				}
			}
		}
	}
	
	public static void main(String[] args) {
		P08 T = new P08();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		f = sc.nextInt();
		
		b = new int[n];
		p = new int[n];
		
		ch = new int[n+1]; // 
		for(int i=0; i<n; i++) {
			b[i] = T.combi(n-1, i); // 콤비네이션 값(규칙) 미리 구해서 넣기
		}
		
		T.DFS(0, 0);
	}
	

}
