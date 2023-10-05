package section01_String;

import java.util.Scanner;

public class P02 {
	public static String solution(String str) {
		String answer ="";
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer +=Character.toLowerCase(x);
			
			// 아스키 숫자로
//			if(x>=97 && x<=122) answer += (char)(x-32);
//			else answer += (char)(x+32);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(solution(str));
	}
}
