package section02_Array;

import java.util.Scanner;

public class P09 { // 2-9 격자판 최대합

	
	public static int solution(int n, int[][] arr) {
		
		
		// ====== 쌤 풀이 ======
		int answer = Integer.MIN_VALUE;
		
		int sum1, sum2; // sum1 : 행의 합, sum2 : 열의 합
		
		for(int i=0; i<n; i++) {
			sum1 = sum2 = 0;
			for(int j=0; j<n; j++) {
				sum1 += arr[i][j];
				sum2 += arr[j][i];
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		sum1=sum2=0;
		
		for(int i=0; i<n; i++) {
			sum1+=arr[i][i];
			sum2+=arr[i][n-i-1];
		}
		
		answer = Math.max(answer, sum1);
		answer = Math.max(answer, sum2);
		
		return answer;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0;i<n;i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println(solution(n, arr));
	}
	
//	public static int solution(int n, int[][] arr) {
//
//		
//		int answer = 0;
//		
//		int rowSum = 0;
//		int colSum = 0;
//		int crossSum = 0;
//		
//		for(int[] i : arr) {
//			for(int j : i) {
//				
//				rowSum +=j;
//				
//			}
//			
//			answer = rowSum>answer? rowSum : answer;
//			rowSum = 0;
//			
//		}
//		
//		for(int j=0; j<n; j++) {
//			for(int i=0; i<n; i++) {
//				colSum += arr[i][j];
//			}
//			answer = colSum>answer? colSum : answer;
//			colSum = 0;
//		}
//		
//		for(int k=0; k<n; k++) {
//			crossSum += arr[k][k];
//		}
//		
//		
//		
//		
//	
//		return answer;
//	}
	
	
	

}
