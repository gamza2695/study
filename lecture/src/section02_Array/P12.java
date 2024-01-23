package section02_Array;

import java.util.Scanner;

public class P12 { // 2-12 멘토링
	
	public static int solution(int n, int m, int[][] arr) {
		
		// ====== 쌤 풀이 ======
		
		// i, j : (멘토, 멘티) 짝 경우의 수 구하기
		// 	-> k : m번 테스트 반복
		//   -> s : 반복해서 등수 찾아내기
		
		//	 s(등수)      0 1 2 3 
		//   k(테스트수)
		//         	     0
		//	             1
		//		         2
		
		int answer = 0; 
		
		for(int i=1; i<=n; i++) { // (i,j) 짝 경우의 수
			for(int j=1; j<=n; j++) {
				int cnt = 0; // (i,j) 짝이 멘토멘티 가능하면 ++
				for(int k=0; k<m; k++) { // 테스트 반복 
					int pi=0, pj=0; // i의 등수, j의 등수
					for(int s=0; s<n; s++) { // 등수 구하기
						if(arr[k][s] == i) pi=s; // i의 등수 찾기
						if(arr[k][s] == j) pj=s; // j의 등수 찾기
					}
					if(pi<pj) cnt++; // i가 멘토 j가 멘티 i 등수가 앞서면 cnt++
				}
				if(cnt == m) { // k가 m번 반복했을 때 i가 j보다 모두 앞서는 경우
					answer++; // 조건에 맞으므로 ++
				}				
			}
		}

		
		return answer;
	}

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[][] arr = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solution(n, m, arr));
	}
	
	
	

}
