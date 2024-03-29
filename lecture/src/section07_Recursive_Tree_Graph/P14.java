package section07_Recursive_Tree_Graph;

// 7-14 그래프 최단거리(BFS)

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P14 {
	
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	
	public void BFS(int v) {
		Queue<Integer> queue = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		queue.offer(v);
		
		while(!queue.isEmpty()) {
			int cv=queue.poll();
			for(int nv : graph.get(cv)) {
				if(ch[nv]==0) {
					ch[nv]=1;
					queue.offer(nv);
					dis[nv] = dis[cv] +1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		P14 T = new P14();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		graph = new ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());
		}
		
		ch = new int[n+1];
		dis = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		T.BFS(1);
		
		for(int i=2; i<=n; i++) {
			System.out.println(i+ " : " + dis[i]);
		}
		
	}

}
