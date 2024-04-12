package section10_DP;

import java.util.Scanner;

public class P01 { // 10-1 계단 오르기
	static int[] dy;
	
	public int solution(int n) {
		
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3; i<=n; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		
		return dy[n];
		
	}
	
	public static void main(String args[]) {
		P01 T = new P01();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		dy = new int[n+1];
		System.out.println(T.solution(n));
		
	}

}