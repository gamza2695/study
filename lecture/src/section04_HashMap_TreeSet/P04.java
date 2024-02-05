package section04_HashMap_TreeSet;

import java.util.HashMap;
import java.util.Scanner;

public class P04 { // 4-4 모든 아나그램 찾기
	
	public static int solution(String a, String b) {
		
		int answer = 0;
		
		HashMap<Character, Integer> am = new HashMap<>();
		HashMap<Character, Integer> bm = new HashMap<>();
		
		// bm 세팅하기
		for(char x : b.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
		
		// am 초기값 세팅하기
		int L = b.length() - 1;
		for(int i=0; i<L; i++) am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
		
		// two pointers 
		int lt = 0;
		for(int rt=L; rt<a.length();rt++) { // rt는 a문자열 끝까지 진행
			
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0)+1); // am에 rt value 증가(rt key가 없다면 만들어서 ++)
			if(am.equals(bm)) answer++;// am과 bm이 같으면 answer++
			
			// 다시 lt설정
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1); // am에서 lt value 빼기
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt)); // lt value가 0이면 해당 lt key 삭제
			lt++; // lt 증가

		}
		
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		
		System.out.println(solution(a, b));
		
		
	}

}
