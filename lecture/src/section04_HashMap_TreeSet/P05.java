package section04_HashMap_TreeSet;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class P05 { // 4-5 K번째 큰 수
	
	
	public static int solution(int n, int k, int[] arr) {
		
		
		int answer = -1; // 존재하지 않을 경우 -1 리턴
		
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder()); // Collections.reverseOrder() : 내림차순으로 자동정렬(안쓸경우 오름차순)
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]); // 순서대로 더한 값들을 Tset에 넣기
				}
			}
		}

		// +) Tset 기능 
		// Tset.remove(143); : Tset 원소 지우기
		// Tset.size(); : Tset 원소 개수
		// Tset.first(); : 첫번째 원소 반환(오름차순인 경우 최소값, 내림차순인 경우 최대값)
		// Tset.last(); : 마지막 원소 반환(오름차순인 경우 최대값, 내림차순인 경우 최소값)
		
		int cnt = 0;
		for(int x : Tset) {
			cnt++;
			if(cnt==k) return x; // Tset에서 k번째 수 찾아 반환
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
		
		System.out.println(solution(n, k, arr));
		
		
	}

}
