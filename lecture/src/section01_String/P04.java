package section01_String;

import java.util.ArrayList;
import java.util.Scanner;

public class P04 {
//	public static String[] solution(String[] strArr) {
//	
//	
//	for(int i = 0; i<strArr.length; i++) {
//		StringBuffer sb = new StringBuffer(strArr[i]);
//		strArr[i] = sb.reverse().toString();
//	}
//	
//
//	
//	return strArr;
//}


// reverse() 이용
public static ArrayList<String> solution(String[] strArr){
	ArrayList<String> answer = new ArrayList<>();
	
	for(String x : strArr) {
		String tmp = new StringBuilder(x).reverse().toString();
		answer.add(tmp);
		
	}
	
	return answer;
}


// char 하나하나
public static ArrayList<String> solution2(String[] strArr){
	ArrayList<String> answer = new ArrayList<>();
	
	for(String x : strArr) {
		char[] s = x.toCharArray();
		
		int lt = 0, rt = x.length()-1;
		while(lt<rt) {
			char tmp = s[lt];
			s[lt] = s[rt];
			s[rt]=tmp;
			lt++;
			rt--;
		}
		
		String tmp = String.valueOf(s); // 객체이름.valueOf 아니고 String.valueOf
		answer.add(tmp);
	}
	return answer;
}


public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();

	String[] strArr = new String[num];
	
	sc.nextLine();
	for(int i = 0; i<num; i++) {
		strArr[i] = sc.next();
	}
	
//	System.out.println(solution(strArr));
	
	for(String x : solution(strArr)){
		System.out.println(x);
	}
}
}
