package section01_String;

import java.util.Scanner;

public class P08 { // 1-8 복잡한 팰린드롬

	public static String solution(String str){
		
		String answer="NO";
		str=str.toUpperCase().replaceAll("[^A-Z]", ""); // A-Z가 아닌 모든 요소들은 ""로 대체한다
		String tmp=new StringBuilder(str).reverse().toString();
		
		if(str.equals(tmp)) answer="YES";
		return answer;
	}

	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // 띄어쓰기도 포함이므로 nextLine
		
		System.out.println(solution(str));
	}
	
}
