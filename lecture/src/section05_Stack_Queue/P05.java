package section05_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class P05 { // 5-5 쇠막대기

	public static int solution(String s) {
		
		int answer = 0;
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<s.length(); i++) { // 바로 앞 요소를 찾기 위해 향상된 for문 보다 인덱스로 접근하기
		
			if(s.charAt(i)=='(') stack.push('('); // '('인 경우 stack에 넣기
			else { // ')'인 경우
				
				stack.pop(); // ')'가 막대기던 레이저던 pop해야 함
				if(s.charAt(i-1)=='(') answer += stack.size(); // 레이저인 경우 잘린 막대기 조각(stack에 있는'(' 개수 더하기
				else answer++; // 막대기인 경우 막대기의 마지막 조각이므로 1 더하기	
			}	
		}
		
		
		return answer;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println(solution(s));
	}

}
