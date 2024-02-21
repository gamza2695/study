package section06_Sorting_Searching;

import java.util.Scanner;

public class P04 { // 6-4 LRU
	
	
	public static int[] solution(int size, int n, int[] arr) {

		int[] cache = new int[size];
		
		for(int x : arr) { // x가 arr에 있는지 없는지 확인(miss/hit 확인)
			int pos = -1; // 인덱스 번호
			for(int i=0; i<size; i++) { // hit인 경우(이미 존재하는 경우) 위치 저장
				if(x==cache[i]) pos = i;
			}
			
			
			if(pos==-1) { // miss인 경우(새로운 요소인 경우)
				for(int i=size-1; i>=1; i--) { // 끝자리부터 1번째까지 한칸씩 뒤로 요소 복사
					cache[i] = cache[i-1];
				}
			}
			else { // hit인 경우(이미 존재하는 경우)
				for(int i=pos; i>=1; i--) { // 저장한 위치에서부터 1번째까지 요소 복소
					cache[i] = cache[i-1];
				}
			}
			
			cache[0] = x; // 0번째자리에는 현재 작업요소 넣기
		}
		
		return cache;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		
		for(int x : solution(s, n, arr)) System.out.print(x + " ");	
	}

}
