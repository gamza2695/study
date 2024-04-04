package section08_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point2{
	public int x, y;
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}	
}

public class P12 { // 8-12 토마토(BFS 활용)
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	static int n, m;
	
	static Queue<Point2> Q = new LinkedList<>(); // main 메서드에서 출발점들을 넣어놔야해서 전역변수로 선언
	
	public void BFS() {
		while(!Q.isEmpty()) {
			Point2 tmp = Q.poll();
			for(int i=0; i<4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<m && board[nx][ny]==0) {
					board[nx][ny] = 1;
					Q.offer(new Point2(nx, ny));
				}
			}
		}
	}
	
	public static void main(String[] args) {
		P12 T = new P12();
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt(); // 열
		n = sc.nextInt(); // 행
		board = new int[n][m];
		dis = new int[n][m];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				board[i][j] = sc.nextInt(); // 토마토 상태 저장
				if(board[i][j]==1) Q.offer(new Point2(i, j)); // Q에 익은 토마토 위치 넣기
			}
		}
		
		T.BFS();
		boolean flag = true;
		int answer = Integer.MIN_VALUE;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) { // 끝까지 익지 않은 토마토 있다면
				if(board[i][j]==0) flag = false; 
			}
		}
		if(flag) { // 다 익었다면
			for(int i=0; i<n; i++) {
				for(int j=0; j<m; j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer); // dis 최대값(최대 날짜) 출력
		}
		else System.out.println(-1);
		
		
	}

}
