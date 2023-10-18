package section01_String;

import java.util.Scanner;

public class P10 { // 1-10 가장 짧은 문자거리

	public static int[] solution(String s, char t){

		int[] answer = new int[s.length()];
		int p = 1000;		
		
		// 오른쪽으로 진행(왼쪽 e와의 거리)
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == t) {
				p=0;
				answer[i] = p;
			}
			else {
				p++;
				answer[i] = p;
			}
		}
		
		// 왼쪽으로 진행(오른쪽 e와의 거리)
		// 기존 answer[i] 값과 새로운 값 중 작은 걸 선택
		p = 1000;
		for(int i=s.length()-1 ; i>=0; i--) {
			if(s.charAt(i) == t) p=0;

			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}

		return answer;
	}

	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next(); // 문자열 s 
		char t = sc.next().charAt(0); // 문자 t
		
		for(int x : solution(s,t)) {
			System.out.print(x+" ");
		}
	}
}
