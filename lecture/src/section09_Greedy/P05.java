package section09_Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
	public int vex; // 정점 번호
	public int cost; // 간선 가중치 값
	
	Edge(int vex, int cost){
		this.vex = vex;
		this.cost = cost;
	}
	
	@Override
	public int compareTo(Edge ob) {
		return this.cost - ob.cost; // 오름차순
	}
}

public class P05 { // 9-5 다익스트라 알고리즘
	
	static int n, m;
	static ArrayList<ArrayList<Edge>> graph;
	static int[] dis;
	
	public void solution(int v) {
		PriorityQueue<Edge> pQ = new PriorityQueue<>(); // 가장 작은값 우선
		pQ.offer(new Edge(v, 0));
		dis[v] = 0;
		while(!pQ.isEmpty()) {
			Edge tmp = pQ.poll();
			int now = tmp.vex;
			int nowCost = tmp.cost;
			if(nowCost>dis[now]) continue;
			
			for(Edge ob : graph.get(now)) {
				if(dis[ob.vex]>nowCost+ob.cost) {
					dis[ob.vex] = nowCost+ob.cost;
					pQ.offer(new Edge(ob.vex, nowCost+ob.cost));
				}
			}
		}
	}
	public static void main(String[] args) {
		P05 T = new P05();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Edge>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Edge>()); 
		}
		
		dis = new int[n+1];
		Arrays.fill(dis, Integer.MAX_VALUE);
		for(int i=0; i<m; i++) {
			int a = sc.nextInt(); // 1 
			int b = sc.nextInt(); // 2 
			int c = sc.nextInt(); // 12
			graph.get(a).add(new Edge(b,c)); // 1->2 12
		}
		T.solution(1);
		for(int i=2; i<=n; i++) {
			if(dis[i]!=Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
			else System.out.println(i+" : impossible");
		}
		
	}

}
