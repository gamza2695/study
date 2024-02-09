package section05_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class P02 { // 5-2 괄호문자 제거
	
	
	public static String solution(String s) {
		
		String  answer= "";
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : s.toCharArray()) {
			
			if(x==')') { // ')'인 경우 짝궁 '('까지 모두 pop
				while(stack.pop()!='('); // stack.pop()은 꺼내는 기능 + 꺼낸 값 반환 기능
				// 반환값이 '('이 아니면 계속 반복 == '('까지 계속 꺼낸다
			}
			else stack.push(x); // ')' 아니면('('이거나 알파벳) 다 stack에 넣기
		}
		
		for(int i=0; i<stack.size(); i++) answer += stack.get(i);
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println(solution(s));
		
	}

}
