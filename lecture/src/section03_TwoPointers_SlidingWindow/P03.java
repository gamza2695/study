package section03_TwoPointers_SlidingWindow;

import java.util.Scanner;

public class P03 { // 3-3 최대 매출(Sliding window)
	
	// 이중 for문으로 구하면 O(n^2)
	// sliding window 사용하면 O(n)
	// -> 기본값을 설정하고 다음 수 더하고 이전 수 하나씩 빼기
	
	
	public static int solution(int n, int k, int[] arr) {
		
		int answer, sum = 0;
		
		for(int i=0; i<k; i++) sum+= arr[i]; // 기본값 설정
		answer = sum;
		
		for(int i=k; i<n; i++) {
			sum+=(arr[i] - arr[i-k]); // 하나씩 더하고 빼기
			answer = Math.max(answer, sum);
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		System.out.println(solution(n, k, arr));
	}

}
