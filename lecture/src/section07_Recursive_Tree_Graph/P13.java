package section07_Recursive_Tree_Graph;

// 7-13 경로탐색(인접리스트, ArrayList)

import java.util.ArrayList;
import java.util.Scanner;

public class P13 {
	
	static int n, m, answer = 0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	
	public void DFS(int v) {
		
		if(v==n) answer++;
		else {
			for(int nv : graph.get(v)) {// v번 arraylist에 추가되어있는 노드들을 하나씩 접근
				if(ch[nv]==0) {
					ch[nv]=1;
					DFS(nv);
					ch[nv]=0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		P13 T = new P13();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		graph = new ArrayList<ArrayList<Integer>>(); // arryalist를 저장할 수 있는 arraylist
		
		for(int i=0; i<=n; i++) { // 0 ~ 5까지 6개 생성(0은 걍 냅둠)
			graph.add(new ArrayList<Integer>()); // arraylist 넣기
		}
		
		ch = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b); // a번 arraylist에 접근-> b추가
		}
		
		ch[1] = 1;
		T.DFS(1);
		System.out.println(answer);
		
	}
	

}
