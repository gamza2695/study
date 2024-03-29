package section07_Recursive_Tree_Graph;

// 7-12 경로탐색(DFS)

import java.util.Scanner;

public class P12 {
	
	// main메서드에서도 읽어야하므로 전역변수 처리
	static int n, m, answer = 0; 
	static int[][] graph;
	static int[] ch;
	
	public void DFS(int v) {
		
		if(v==n) answer++;
		else {
			for(int i=1; i<=n; i++) {
				if(graph[v][i]==1 && ch[i]==0) { // 노드v에서 노드i로 갈 수 있고 + 노드i에 방문하지 않았을 때
					ch[i] = 1;
					DFS(i);
					// 다시 back했을 경우 체크 해제
					ch[i]=0;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		P12 T = new P12();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		graph = new int[n+1][m+1];
		ch = new int[n+1];
		
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b] = 1;
		}
		
		ch[1] = 1;
		T.DFS(1);
		
		System.out.println(answer);
		
	}

}
