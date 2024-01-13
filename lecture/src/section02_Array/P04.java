package section02_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04 { // 2-4 피보나치 수열
	
	public static List<Integer> solution(int n){
		
		// ====== 내 풀이 ======
		// 간단하게 생각하기..
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(1);
		for(int i=2; i<n; i++) {
			list.add(i, list.get(i-2)+list.get(i-1));
		}
		
		return list;
		
		
		// ====== 쌤 풀이 1 ======
//		int[] 반환
		
//		int[] answer = new int[n];
//		answer[0] = 1;
//		answer[2] = 1;
//		
//		for(int i=2; i<n; i++) {
//			answer[i] = answer[i-2]+answer[i-1];
//		}
//		
//		return answer;
		
		// ====== 쌤 풀이 2 ======
		// 배열 안쓰고!
		
//		int a=1, b=1, c;
//		System.out.println(a+ " " + b + " ");
//		for(int i=2; i<n; i++) {
//			c=a+b;
//			System.out.println(c+" ");
//			a=b;
//			b=c;
//		}
		
	}

	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(solution(n));
	}
	
	

}
