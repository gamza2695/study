package ch03_greedy;

import java.util.Scanner;

public class P02 { // 실전 3-3 숫자 카드 게임
					// => 각 행마다 가장 작은 수를 찾은 뒤 그 수 중에서 가장 큰 수 찾기
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// n, m을 공백을 기준으로 구분하여 입력 받기
		int n = sc.nextInt();
		int m = sc.nextInt();
		int result = 0;
		
		
		// 한 줄씩 입력 받아 확인하기
		for(int i=0; i<n; i++) {
			
			// 현재 줄에서 '가장 작은 수' 찾기
			int minNo = 10001;
			for(int j=0; j<m; j++) {
				int x = sc.nextInt();
				minNo = Math.min(minNo, x);
			}
			// '가장 작은 수'들 중에서 가장 큰 수 찾기
			result = Math.max(result, minNo);
		}
		
		// 최종 답안 출력
		System.out.println(result);
		
	}

}
