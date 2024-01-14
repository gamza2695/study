package section02_Array;

import java.util.Scanner;

public class P05 { // 2-5 소수(에라토스테네스 체) : 소수 구하는 것 중 가장 빠르다!

	public static int solution(int n){
		
		
		// ====== 쌤 풀이 ======
		
		int answer = 0;
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(ch[i]==0) {
				answer++;
				for(int j=i; j<=n; j=j+i) {
					ch[j]=1;
				}
			}
		}
		return answer;
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(solution(n));
	}
}
