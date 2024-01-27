package section03_TwoPointers_SlidingWindow;

import java.util.Scanner;

public class P04 { // 3-4 연속부분수열(복합적 문제)
	
	// 이중 for문으로 구하면 O(n^2)
	// -> sliding window 사용하면 O(n)
	// lt ~ rt 까지의 연속합이 특정 숫자가 되는지 확인한다
	
	public static int solution(int n, int m, int[] arr) {
		
		int answer = 0, sum = 0, lt = 0;
		
		for(int rt=0; rt<n; rt++) { // lt는 rt 따라간다
			
			sum+= arr[rt];
			if(sum == m ) answer ++; // sum : lt부터 rt까지의 값
			
			while(sum>=m) {
				sum-=arr[lt++]; // lt가 가리키는 값 빼고나서 증가시키기
				if(sum==m) answer++;
			}
		}

		
		return answer;
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, m, arr));
	}

}
