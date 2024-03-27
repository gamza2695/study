package section07_Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P08 { // 7-8 송아지 찾기1(BFS)

	int answer = 0;
	int[] dis = {1, -1, 5}; // 이동방법
	int[] ch; // 체크배열
	
	Queue<Integer> Q = new LinkedList<>(); // 경로 결과 저장할 큐
	
	public int BFS(int s, int e) {
		
		ch = new int[10001];
		ch[s] = 1; // 출발지점 체크
		
		Q.offer(s); // 큐에 넣기
		int L = 0; // 레벨
		
		while(!Q.isEmpty()) {
			int len = Q.size(); // 각 레벨에 있는 원소들의 개수
			
			for(int i=0; i<len; i++) {
				int x = Q.poll(); // 원소 꺼내기
				
				for(int j=0; j<3; j++) {
					int nx = x+dis[j]; // hx는 x의 자식노드 5인 경우 6, 4, 10 생성
					
					if(nx==e) return L+1; // 송아지 위치와 같으면 그 레벨 리턴하기. 자식노드이므로 L+1
					
					if(nx>=1 && nx<=10000 && ch[nx]==0) { // 자식노드는 1이상 10000이하이고 nx에 방문한적 없는 경우에만
						ch[nx] = 1; // 방문 체크
						Q.offer(nx); // Q에 넣기
						
					}
				}
			}
			
			L++; // 레벨 증가
		}
		
		return 0;
	}
	
	
	public static void main(String[] args) {
		
		P08 T = new P08();
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		System.out.println(T.BFS(s, e));
		
	}
}
