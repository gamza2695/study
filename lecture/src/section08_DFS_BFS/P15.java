package section08_DFS_BFS;

import java.util.ArrayList;
import java.util.Scanner;

class Point4{
	public int x, y;
	Point4(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class P15 { // 8-15 피자 배달 거리
	
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi; // 조합 저장
	static ArrayList<Point4> hs, pz; // 집과 피자집의 좌표  
	
	public void DFS(int L, int s) {
		
		if(L==m) { // len(Combination)m에 해당하는 조합
//			for(int x : combi) System.out.print(x+" "); // 모든 조합의 수 출력
//			System.out.println();
			
			int sum = 0;
			for(Point4 h : hs) { // 각 조합에서 집마다 배달거리구하기
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y)); // 거리 구하기
				}
				sum += dis; // 도시의 피자배달거리
			}
			
			answer = Math.min(answer, sum); // 도시의 피자배달거리 중 최소값 찾기
		}
		else {
			for(int i=s; i<len; i++) { // 조합구하기
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		P15 T = new P15();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		hs = new ArrayList<>();
		pz = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				int tmp = sc.nextInt();
				if(tmp == 1) hs.add(new Point4(i,j)); // 1인 지점은 집
				else if(tmp==2) pz.add(new Point4(i,j)); // 2인 지점은 피자집
			}
		}
		len = pz.size(); // 피자집의 개수
		combi = new int[m]; // len(Combi)m
		T.DFS(0, 0);
		System.out.println(answer);

	
	}
	
	

}
