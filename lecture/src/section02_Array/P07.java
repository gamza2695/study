package section02_Array;

import java.util.Scanner;

public class P07 { // 2-7 점수계산
	
	
	private static int solution(int n, int[] arr) {
		
		
		// ====== 내 풀이 ======
		// why..이렇게..?
		int result = arr[0];
		int bonus = 0; 
		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i-1]==0) {
				result += arr[i];
				bonus=0;
			}
			else {
				result += arr[i]+bonus;
				bonus++;
			}
			
		}
		
		return result;
		
		// ====== 쌤 풀이 ======
//		int answer = 0, cnt = 0;
//		for(int i=0; i<n; i++) {
//			if(arr[i]==1) {
//				cnt++;
//				answer+=cnt;
//			}
//			else cnt = 0;
//		}
//		
//		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, arr));
	}



}
