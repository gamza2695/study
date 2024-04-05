package section08_DFS_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point3{
	int x, y;
	Point3(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class P14 { // 8-14 섬나라 아일랜드(BFS)
	
	static int answer = 0, n;
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	
	Queue<Point3> queue = new LinkedList<>();
	
	public void BFS(int x, int y, int[][] board) {
		
		queue.add(new Point3(x,y)); // 1인 지점 넣기
		
		while(!queue.isEmpty()) { // 큐가 비어있을때 까지
			Point3 pos = queue.poll(); // 현재 큐 꺼내기
			
			for(int i=0; i<8; i++) {
				int nx = pos.x + dx[i];
				int ny = pos.y + dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny] == 1) { // 1->0으로 바꾸고 큐에 추가
					board[nx][ny] = 0;
					queue.add(new Point3(nx,ny));
				}
			}
		}
	}
	
	public void solution(int[][] board) {
		for(int i=0; i<n; i++) { // 1 탐색
			for(int j=0; j<n; j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j] = 0;
					BFS(i,j,board);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		P14 T = new P14();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		T.solution(arr);
		System.out.println(answer);
	}

}
