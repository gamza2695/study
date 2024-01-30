package section03_TwoPointers_SlidingWindow;

import java.util.Scanner;

public class P06 { // 3-6 최대 길이 연속부분 수열
	
	public static int solution(int n, int k, int[] arr) {
		
		int answer = 0, cnt =0, lt=0;
		
		for(int rt=0; rt<n; rt++) {
			if(arr[rt]==0) cnt ++; // 0->1로 바꾼다
			
			while(cnt>k) {
				if(arr[lt]==0) cnt--; // 1->0으로 되돌린다
				lt++;
			}
			
			answer = Math.max(answer, rt-lt+1);
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
 		}
		
		System.out.println(solution(n,k,arr));
	}
	
	
	
	
	
	

}
