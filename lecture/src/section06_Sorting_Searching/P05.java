package section06_Sorting_Searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class P05 { // 6-5 중복 확인
	
	// 1. HashMap 사용해서 풀기 - 시간복잡도 : n
	// 2. 정렬 사용해서 풀기 - 시간복잡도 : nlogn (hashMap 사용하는 게 낫다)
	
	public static String solution(int n, int[] arr) {
		
		String answer = "U";
		
		// 해시맵
		HashMap<Integer, Integer>  map = new HashMap<>();
		
		for(int k : arr) {
			
			if(map.containsKey(k)) return "D";
			
			map.put(k, 1);
		}
		
		
		// 정렬
		Arrays.sort(arr); // 배열 정렬하기(오름차순)
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) return "D";
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, arr));
		
	}

}
