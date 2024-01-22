package section02_Array;

import java.util.Scanner;

public class P11 { // 2-11 임시반장정하기
	
	private static int solution(int n, int[][] arr) {
		
		
		// ====== 내 풀이 ======
//		int[] count = new int[n];
//		
//		for(int j=0; j<5; j++) {
//			for(int i=0; i<n; i++) {
//				for(int k=0; k<n; k++) {
//					if(arr[i][j] == arr[k][j]) count[i]++;	
//				}		
//			}	
//		}
		
		
		// ====== 쌤 풀이 ======
		int answer = 0, max = Integer.MIN_VALUE;
		
		for(int i=1; i<=n; i++) { // i는 학생 번호
			int cnt = 0;
			for(int j=1; j<=n; j++) { // i학생과 j학생비교 (자기자신 포함)
				for(int k=1; k<=5; k++) { // k는 학년
					if(arr[i][k] == arr[j][k]) {
						cnt++;
						break; // 3번과 4번학생이 2학년때 같은반, 3학년때 같은반이므로
							//break구문이 없으면 중복으로 카운팅됨
					}
				}
			}
			if(cnt>max) {
				max=cnt;
				answer = i;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
//		int[][] arr = new int[n][5];
		int[][] arr = new int[n+1][6]; // 0 사용 안하고 1부터
		
		
		
//		for(int i=0;i<n;i++) {
//			for(int j=0; j<5; j++) {
//				arr[i][j] = sc.nextInt();
//			}
//		}
		for(int i=1;i<=n;i++) {
			for(int j=1; j<=5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solution(n, arr));
		
		
	}

}
