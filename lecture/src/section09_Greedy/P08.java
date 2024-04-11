package section09_Greedy;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge3 implements Comparable<Edge3>{
	public int vex;
	public int cost;
	Edge3(int vex, int cost){
		this.vex = vex;
		this.cost = cost;	
	}
	@Override
	public int compareTo(Edge3 ob) {
		return this.cost-ob.cost; // 오름차순
	}
}

public class P08 { // 9-8 원더랜드(최소 스패닝 트리 : 프림, PriorityQueue)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Edge3>> graph = new ArrayList<ArrayList<Edge3>>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Edge3>());
		}
		int[] ch = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			// 인접리스트 만들기
			graph.get(a).add(new Edge3(b,c)); // a->b
			graph.get(b).add(new Edge3(a,c)); // b->a
		}
		
		int answer = 0; 
		PriorityQueue<Edge3> pQ = new PriorityQueue<>();
		pQ.offer(new Edge3(1,0)); // 1번 정점 넣어주기
		while(!pQ.isEmpty()) {
			Edge3 tmp = pQ.poll(); // 최소 정점 꺼내기
			int ev = tmp.vex; // 도착 정점
			if(ch[ev]==0) { // 회로가 되지 않는 정점들만
				ch[ev] = 1;
				answer += tmp.cost;
				for(Edge3 ob : graph.get(ev)) { // 정점과 연결된 간선들 중 체크되지 않은 간선들 넣기
					if(ch[ob.vex]==0) pQ.offer(new Edge3(ob.vex, ob.cost));
				}
			}
		}
		System.out.println(answer);
	}
	  

}
