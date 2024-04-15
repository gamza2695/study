package section10_DP;

import java.util.Scanner;

public class P06 { // 10-6 최대점수 구하기(냅색 알고리즘)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] dy = new int[m+1];
		for(int i=0; i<n; i++) {
			int ps = sc.nextInt(); // 점수
			int pt = sc.nextInt(); // 푸는 시간
			
			for(int j=m; j>=pt; j--) { // 뒤에서부터 
				dy[j] = Math.max(dy[j], dy[j-pt]+ps);
			}
		}
		
		System.out.println(dy[m]);
		
	}
}
 