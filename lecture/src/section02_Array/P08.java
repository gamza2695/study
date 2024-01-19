package section02_Array;

import java.util.Scanner;

public class P08 { // 2-8 등수구하기

	
	public static int[] solution(int n, int[] arr) {

		// ====== 쌤 풀이 ======
		int[] answer = new int[n];
		int cnt = 1; 
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(arr[i]<arr[j]) {
					cnt++;
				}
			}
			answer[i] = cnt;
			cnt=1;
		}
	
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i : solution(n, arr)) {
			System.out.print(i + " ");
		}
		
	}


}
