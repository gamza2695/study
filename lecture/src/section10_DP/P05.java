package section10_DP;

import java.util.Arrays;
import java.util.Scanner;

public class P05 { // 10-5 동전교환(냅색 알고리즘)
	
	 static int n, m;
	 static int[] dy;
	 public int solution(int[] coin) {
		 Arrays.fill(dy, Integer.MAX_VALUE); // dy를 큰숫자로 초기화
		 dy[0]= 0;
		 for(int i=0; i<n; i++) { // dy 돌면서
			 for(int j=coin[i]; j<=m; j++) { 
				 dy[j] = Math.min(dy[j], dy[j-coin[i]] + 1);
			 }
		 }
		 
		 return dy[m];
	 }
	 
	 public static void main(String[] args) {
		P05 T = new P05();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		m = sc.nextInt();
		dy = new int[m+1];
		System.out.println(T.solution(arr));
	}

}
