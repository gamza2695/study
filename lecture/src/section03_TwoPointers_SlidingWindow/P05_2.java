package section03_TwoPointers_SlidingWindow;

import java.util.Scanner;

public class P05_2 { // 3-5 연속된 자연수의 합(수학)
	public static int solution(int n) {
		
		int answer = 0, cnt = 1; // cnt는 연속된 자연수의 개수
		
		n--;
		
		while(n>0) {
			cnt++;
			n = n - cnt; // n에서 1,2 뺌 / cnt++ 이면 n에서 1,2,3뺌
			if(n%cnt==0) answer++; // 나누어떨어지면 연속된 수로 표현가능-> 그냥 단순히 answer++!!
		}

		return answer; 	
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		System.out.println(solution(n));
		
	}

}
