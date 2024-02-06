package section05_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class P01 { // 5-1 올바른 괄호
	
	
	public static String solution(String s) {
		
		String answer = "YES";
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : s.toCharArray()) {
			
			if(x=='(') stack.push(x); // '(' 인 경우 push
			else { // )인 경우 stack 검사
				if(stack.isEmpty()) return "NO"; // 비어있으면 잘못된 경우
				stack.pop(); // 비어있지 않은 경우 pop
			}
		}
		
		if(!stack.isEmpty()) return "NO"; // 모든 반복문 끝났는데도 stack에 '('가 남아있으면 NO  
		

		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println(solution(s));
	}
	

}
