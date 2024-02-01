package section04_HashMap_TreeSet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class P03 { // 4-3 매출액의 종류
	
	
	private static ArrayList<Integer> solution(int n, int k, int[] arr) {
		
		ArrayList<Integer> answer = new ArrayList<>(); // answer 값 넣을 ArrayList 선언
		
		HashMap<Integer, Integer> HM = new HashMap<>(); // 종류 카운트 할 HashMap 선언
		
		for(int i=0; i<k-1; i++) { // k=4이면 k=2일때까지의 arr요소들을 HashMap에 put
			HM.put(arr[i], HM.getOrDefault(arr[i], 0) + 1);
		}
		
		// sliding windows
		int lt = 0;  
		
		for(int rt = k-1; rt<n; rt++) { // rt는 3부터 계속 반복
			HM.put(arr[rt], HM.getOrDefault(arr[rt], 0) + 1); // arr[rt] 값 add
			answer.add(HM.size()); // answer에 종류수 넣는다
			
			HM.put(arr[lt], HM.get(arr[lt])-1); // arr[lt] key의 value 값 --;
			if(HM.get(arr[lt])==0) HM.remove(arr[lt]); // arr[lt] key값의 value가 0이면 key 삭제
			lt++; // lt 증가
		}

		return answer;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int x : solution(n,k,arr)) System.out.print(x + " ");
		
		
		
	}


}
