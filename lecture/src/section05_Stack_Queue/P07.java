package section05_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P07 { // 5-7 교육과정설계
	
	
	public static String solution(String need, String plan) {
		
		String answer = "YES";
		Queue<Character> Q = new LinkedList<>();
		
		
		for(char x : need.toCharArray()) Q.offer(x); // 필수과목 Q에 넣기
		for(char x : plan.toCharArray()) { // 수업계획 반복하면서 확인하기
			
			if(Q.contains(x)) { // x가 필수과목이면
				if(x!=Q.poll()) return "NO"; // 꺼냈을 때 x가 Q의 맨앞과 다르면 (순서 아님)
			}
		}
		
		if(!Q.isEmpty()) return "NO"; // 필수과목이 모두 이수되지 않은 경우
	
		
		return answer;	
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next(); // 필수과목
		String b = sc.next(); // 계획
		
		
		System.out.println(solution(a,b));
		
	}

}
