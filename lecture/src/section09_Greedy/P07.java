package section09_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge2 implements Comparable<Edge2>{ // 간선 정보 객체로 저장하기 위한 클래스 생성
	public int v1;
	public int v2;
	public int cost;
	
	Edge2(int v1, int v2, int cost){
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge2 ob) {
		return this.cost - ob.cost; // 간선 작은거부터 오름차순 정렬
	}
}

public class P07 { // 9-7 원더랜드(최소 스패닝 트리 : 크루스칼, Union & Find 활용)

	 static int[] unf;
	 public static int Find(int v) {
		 if(v==unf[v]) return v;
		 else return unf[v] = Find(unf[v]);
	 }
	 
	 public static void Union(int a, int b) {
		 int fa = Find(a);
		 int fb = Find(b);
		 if(fa!=fb) unf[fa] = fb;
	 }
	
	 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt(); // 도시 개수
		 int m = sc.nextInt(); // 도로 개수
		 unf = new int[n+1];
		 ArrayList<Edge2> arr = new ArrayList<>();
		 
		 for(int i = 1; i<=n; i++) unf[i] = i;
		 for(int i=0; i<m; i++) {
			 int a = sc.nextInt();
			 int b = sc.nextInt();
			 int c = sc.nextInt();
			 arr.add(new Edge2(a,b,c));
		 }
		 
		 int answer = 0;
		 
		 Collections.sort(arr); // 오름차순 정렬
		 for(Edge2 ob : arr) {
			 int fv1 = Find(ob.v1);
			 int fv2 = Find(ob.v2);
			 if(fv1 != fv2) {
				 answer+=ob.cost;
				 Union(ob.v1, ob.v2); // 한 집합으로 묶기
			 }
		 }
		 
		 System.out.println(answer);
	 }
	 
	
	
}
