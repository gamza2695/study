package section08_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point{ // 좌표 클래스
	public int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class P11 { // 8-11 미로의 최단거리 통로(BFS) // 왜 답 안나오지..?
	
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int[][] board, dis;
	
	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x,y));
		
		board[x][y] = 1; // 출발점 체크
		
		while(!Q.isEmpty()) { // Q가 비어있을때까지
			Point tmp = Q.poll(); // Q 뽑기
			
			for(int i=0; i<4; i++) { // 네 방향 반복
				int nx = tmp.x+dx[i];
				int ny = tmp.y+dy[i];
				
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0) { // board안에서 유효한 nx,ny라면
					board[nx][ny] = 1; // 체크
					Q.offer(new Point(nx,ny)); // Q에 넣기
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1; // dis 좌표에 현재좌표+1해서 넣기

				}
			}
		}
	}
	
	public static void main(String[] args) {
		P11 T = new P11();
		Scanner sc = new Scanner(System.in);
		
		board = new int[8][8];
		dis = new int[8][8];
		
		for(int i=0; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		T.BFS(1, 1);
		if(dis[7][7]==0) System.out.println(-1); // 도착할 수 없으면 -1 출력
		else {
			System.out.println(dis[7][7]);
		}
		
	}

}
