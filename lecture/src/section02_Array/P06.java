package section02_Array;

import java.util.ArrayList;
import java.util.Scanner;

public class P06 { // 2-6 뒤집은 소수
	
	public static ArrayList<Integer> solution(int n, int[] arr){
		
		
		ArrayList<Integer> answer = new ArrayList<>(); // 답 넣을 list 생성
		
		for(int i=0; i<n; i++) { // arr[] 돌면서 반복
			int tmp = arr[i];
			int res = 0;
			
			while(tmp>0) { // tmp의 각 자리수 구해서 res 만들기
				int t = tmp%10;
				res =res*10 + t;
				tmp = tmp/10;
			}
			if(isPrime(res)) { // 소수이면 answer에 추가
				answer.add(res);
			}
		}

		return answer;
		
	}
	
	// 소수인지 구하는 메서드
	private static boolean isPrime(int num) {
		
		if(num==1) return false;
		for(int i=2; i<num; i++) {
			if(num%i==0) return false;
		}
		
		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}

		for(int k : solution(n,arr)) {
			System.out.print(k + " ");
		}
		
	}	

}
