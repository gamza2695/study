package section01_String;

import java.util.Scanner;

public class P07 { // 1-7 회문 문자열,팰린드롬

	public static String solution(String str){

		// 내 풀이
		String answer="";
		char[] c = str.toUpperCase().toCharArray();
		
		for(int i = 0; i<str.length()/2 ; i++) {
			if(c[i]!=c[str.length()-1-i]) return "NO";
		}
		
		return "YES";
		
		/* ======= 풀이-1 =======
		String answer="YES";
		
		str=str.toUpperCase();
		int len=str.length();
		
		for(int i=0; i<len/2; i++){
			if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
		}
		return answer;
		*/
		
		
		/* ======= 풀이-2 =======
		 * StringBuilder로 반대로 작성된 문자를 만들어 비교한다
		String answer="NO";
		String tmp=new StringBuilder(str).reverse().toString();

		if(str.equalsIgnoreCase(tmp)) answer="YES";
		
		return answer;
		*/
	}

	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(solution(str));
	}
}