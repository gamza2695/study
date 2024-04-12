package section10_DP;

import java.util.Scanner;

public class P02 { // 10-2 돌다리 건너기
	
	static int[] dy;
	
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3; i<=n+1; i++) {
			dy[i] = dy[i-2] + dy[i-1];
			
		}
		
		return dy[n+1];
	}
	
	public static void main(String args[]) {
		P02 T = new P02();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int[n+2];
		System.out.println(T.solution(n));
	}

}
