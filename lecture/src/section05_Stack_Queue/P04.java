package section05_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class P04 { // 5-4 후위식 연산(postfix)
	
	
	public static int solution(String s) {
		
		int answer = 0;
		
		Stack<Integer> stack = new Stack<>(); // 숫자 넣을 스택 선언
		
		for(char x : s.toCharArray()) { 
			
			if(Character.isDigit(x)) stack.push(x-48); // 숫자인거 확인 + char '5' 를 숫자 5로 넣으려면 x - 48 ('0' = 48)
			else { // 연산자를 만났을 때
				int rt = stack.pop();
				int lt = stack.pop(); // 숫자 가져오기
				
				if(x == '+') stack.push(lt+rt);
				else if(x == '-') stack.push(lt-rt);
				else if(x == '*') stack.push(lt*rt);
				else if(x == '/') stack.push(lt/rt); // 연산하기
				
			}
		}
		
		answer = stack.get(0); // 마지막 숫자가 답!
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		System.out.println(solution(s));
		
		
		
	}

}
