package section01_String;

import java.util.Scanner;

public class P03 {
	public static String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE; // 최소값 지정
		
		String[] s = str.split(" "); // " "으로 나눠서 String 배열에 단어 저장
		
		for(String x : s) {
 			int len = x.length(); // 반복하면서 String 배열 요소 하나의 길이를 len에 저장
			if(len>m) { // len이 m보다 크다면
				m = len; // len은 m
				answer = x; // 최대값이 남는다
			}
		}
		return answer;
	}
	
	
	public static String solution2(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		
		while((pos= str.indexOf(' ')) != -1){ // str을 ' ' 로 나눈 인덱스 번호가 없을때까지 반복
			String tmp = str.substring(0,pos); // tmp는 str를 0~pos전까지 나눈 단어
			int len = tmp.length(); // tmp 단어의 길이는 len
			if(len>m) {
				m = len;		// len 비교해서 제일 긴 길이 찾기
				answer = tmp; 	// 최대 길이 단어 tmp가 answer 
			}
			
			str = str.substring(pos+1); // 다음 단어로 넘어가기 위해서 pos다음 단어부터 끝까지 문장을 str로 변경	
		}
		if(str.length()>m) answer = str; // while문에서 문장 str의 마지막 단어는 조사하지 못함
										// 별도로 마지막 단어에 대해 조사하기
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(solution(str));
	}

}
