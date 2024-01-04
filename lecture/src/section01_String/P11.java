package section01_String;

import java.util.Scanner;

public class P11 { // 1-11 문자열 압축 

	public static String solution(String s){

		String  answer = "";
		
		s = s+" "; //  이게 킥!
		
		int count = 1;
		
		
		for(int i = 0; i<s.length()-1;i++) {
			if(s.charAt(i) == s.charAt(i+1)) {
				count +=1;
			}
			else if(count>1 && s.charAt(i) != s.charAt(i+1)){
				answer += s.charAt(i);
				answer += count;
				count = 1;
			}
			else{
				answer += s.charAt(i);
			}
			
		}
		return answer;
		
		
		
		// ======= 풀이 =======
//		String answer="";
//		s=s+" ";
//		int cnt=1;
//		for(int i=0; i<s.length()-1; i++){
//			if(s.charAt(i)==s.charAt(i+1)) cnt++;
//			else{
//				answer+=s.charAt(i);
//				if(cnt>1) answer+=String.valueOf(cnt);
//				cnt=1;
//			}
//		}
//		return answer;
	}

	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(solution(s));
		
	
	}
}
