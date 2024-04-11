package section09_Greedy;

import java.util.Scanner;

public class P06 { // 9-6 친구인가(Disjoint-Set : Union & Find)
	
	static int[] unf;
	
	public static int Find(int v) { // v번 학생의 집합 번호 리턴 
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]); // 노드 압축 : 시간복잡도 줄이기
	}
	
	public static void Union(int a, int b) { // a,b는 친구관계 -> 한 집합으로 만들기
		int fa = Find(a);
		int fb = Find(b);
		if(fa!=fb) unf[fa] = fb;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 학생수
		int m = sc.nextInt(); // 순서쌍 개수
		
		unf = new int[n+1]; // 학생수에 맞는 unf 배열 생성
		for(int i=1; i<=n; i++) unf[i] = i;
		for(int i=1; i<=m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Union(a,b); 
		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int fa = Find(a);
		int fb = Find(b);
		if(fa==fb) System.out.println("YES");
		else System.out.println("NO");
		
	}
	

}
