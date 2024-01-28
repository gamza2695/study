package section03_TwoPointers_SlidingWindow;

import java.util.Scanner;

public class P05 { // 3-5 연속된 자연수의 합(two pointers)
	
	
	public static int solution(int n) {
		
		int answer = 0, sum = 0, lt = 0;
		int m = n/2 + 1;
		int[] arr = new int[m];
		
		for(int i=0; i<m; i++) arr[i] = i+1; // arr에 1부터 m까지 입력
		
		// lt와 rt 
		for(int rt=0; rt<m; rt++) { // rt 증가시키면서
			sum += arr[rt]; // sum에 더하기
			if(sum==n) answer ++; // sum이 n이면 카운트
			
			while(sum>=n) { // sum이 n보다 크다면
				sum-=arr[lt++]; // lt 증가(sum에서 lt를 뺀다)
				if(sum==n) answer++; // sum이 n이면 카운트
			}
		}
		
		return answer; 
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(solution(n));
		
	}

}
