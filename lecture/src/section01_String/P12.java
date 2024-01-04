package section01_String;

import java.util.Scanner;

public class P12 { // 1-12 암호

	public static String solution(int n,String s){

		
		// 내 풀이
		String  answer = "";
		
		s= s.replace("#", "1");
		s= s.replace("*", "0");

		String [] array = s.split("(?<=\\G.{" + 7 + "})"); // 특정길이만큼 분할하는 정규식 패턴
		
		for(int i = 0; i<array.length;i++) {
			answer +=(char)Integer.parseInt(array[i],2);
		}

		return answer;
		
		
		// 풀이
//		String answer = "";
//		for(int i =0; i<n;i++) {
//			String tmp = s.substring(0,7).replace("#", '1').replace("*", '0');
//			int num = Integer.parseInt(tmp, 2);
//			answer+=(char)num;
//			s=s.substring(7);
//		}
//		return answer;

	}

	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		
		System.out.println(solution(n,s));
		
	
	}
}
