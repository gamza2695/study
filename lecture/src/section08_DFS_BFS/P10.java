package section08_DFS_BFS;

import java.util.Scanner;

public class P10 { // 8-10 미로탐색(DFS)
	static int[] dx = {-1,0,1,0}; // 9시-12시-3시-6시
	static int[] dy = {0,1,0,-1};
	static int[][] board;
	static int answer = 0;
	
	public void DFS(int x, int y) {
		
		if(x==7 && y==7) { // 도착점 도착
			answer++;
		}
		else {
			for(int i=0; i<4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx>=1 && nx<=7 && ny>=1 && ny<=7 && board[nx][ny]==0) { // nx와 ny가 board 안에 있고, 간 적이 없는 경우
					board[nx][ny] = 1; // 갔다고 체크
					DFS(nx, ny);
					board[nx][ny] = 0; // 뒤로 back 했을때 다시 체크 해제
				}
			}
		}
	}
	
	public static void main(String[] args) {
		P10 T = new P10();
		Scanner sc = new Scanner(System.in);
		
		board = new int[8][8];
		
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		board[1][1] = 1; // 출발점 체크
		T.DFS(1, 1);
		System.out.println(answer);
	}
	

}
