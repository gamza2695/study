package section01_String;

import java.util.Scanner;

public class P09 { // 1-9 숫자만 추출

	public static int solution(String str){
		
		// 내 풀이
		int answer = 0;
		str=str.replaceAll("[a-z,A-Z]", "");
		answer = Integer.valueOf(str);
		
		return answer;
		
		
		/* ======= 풀이-1 =======
		 * 아스키 넘버로 구하기
		 * 
		int answer = 0;
		for(char x: str.toCharArray()) {
			if(x>=48 && x<=57) answer = answer*10+(x-48);
		}
		return answer;
		*/
		
		
		/* ======= 풀이-2 =======
		 * isDigit() 메서드 사용하기
		 * 
		String answer = "";
		for(char x: str.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		return Integer.parseInt(answer); // 0208 => 208
		*/
		
	}

	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); 
		
		System.out.println(solution(str));
	}
	
}
