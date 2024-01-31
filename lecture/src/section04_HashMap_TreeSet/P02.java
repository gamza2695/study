package section04_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class P02 { // 4-2 아나그램

	public static String solution(String s1, String s2) {
		
		String answer="YES";
	
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s1.toCharArray()) { // HashMap에 s1 요소 넣기
			map.put(x, map.getOrDefault(x, 0)+1);
		}
		
		for(char x : s2.toCharArray()) { // HashMap에서 s2 요소 검사
			if(!map.containsKey(x) || map.get(x) == 0) return "NO"; // x를 포함하지 않거나 이미 0이면 아나그램 아님
			
			map.put(x, map.get(x)-1); // HashMap에서 s2요소 개수 빼기
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		System.out.println(solution(s1,s2));
		
	}


	
}
