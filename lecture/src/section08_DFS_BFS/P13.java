package section08_DFS_BFS;

import java.util.Scanner;

public class P13 { // 8-13 섬나라 아일랜드(DFS)
	
	static int answer = 0, n;
	static int[] dx = {-1,-1,0,1,1,1,0,-1};
	static int[] dy = {0,1,1,1,0,-1,-1,-1};
	
	public void DFS(int x, int y, int[][] board) {
		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1) { // 1일때만 뻗어나가기
				board[nx][ny] = 0;
				DFS(nx, ny, board);
			}
		}
	}
	
	public void solution(int[][] board) {
		for(int i=0; i<n; i++) { // board에서 1 탐색하기
			for(int j=0; j<n; j++) {
				if(board[i][j]==1) {
					answer++;
					board[i][j] = 0; // 출발점 0으로 바꾸는 거 여기서(위 dfs에서는 출발점은 0으로 바꿀 수 없어서)
					DFS(i,j,board);
				}
			}
		}
	}
	
	
	public static void main(String[] args) {
		P13 T = new P13();
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
