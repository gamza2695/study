package section02_Array;

import java.util.Scanner;

public class P10 { // 2-10 봉우리

	public static int solution(int n, int[][] arr) {
		
		int count = 0;
		
		// ====== 내 풀이 ======
		for(int i=1; i<arr.length-1; i++) {
			for(int j=1; j<arr.length-1; j++) {				
				if(arr[i][j]>arr[i-1][j] && arr[i][j]>arr[i+1][j] && arr[i][j]>arr[i][j-1] && arr[i][j]>arr[i][j+1]) {
					count++;
				}
			}
		}
		return count;
	}
	
	// ====== 쌤 풀이 ======
	// 미리 방향 배열을 만든다!
	// int[] dx = {-1,0,1,0};
	// int[] dy = {0,1,0,-1}; // => 네 방향에 대한 배열!
	
	// 인스턴스 변수로 선언해도 ok
//	int[] dx = {-1, 0, 1, 0};
//	int[] dy = {0, 1, 0, -1};
//	
//	public int solution(int n, int [][] arr) { // arr nxn 배열로..
//		int answer = 0;
//		for(int i=0; i<n; i++) {
//			for(int j=0; j<n; j++) {
//				boolean flag = true;
//				for(int k=0; i<4; k++) { // 방향 탐색해서 계산
//					int nx = i + dx[k];
//					int ny = j + dy[k];
//					if(nx>=0 && nx<n && ny>=0 & ny<n && arr[nx][ny]>=arr[i][j]) { // 앞에서 미리 경계선 걸러내기
//						flag=false;
//						break; // false 나오면 그냥 나오기
//					}
//				}
//				if(flag) answer++;
//			}
//		}
//	
//		return answer;
//	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+2][n+2];
		
		for(int i=1;i<n+1;i++) {
			for(int j=1; j<n+1; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		
		System.out.println(solution(n, arr));
	}
}
