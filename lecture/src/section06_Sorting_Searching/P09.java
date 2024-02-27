package section06_Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class P09 { // 6-9 뮤직비디오(결정알고리즘) 

	
	public static int count(int[] arr, int capacity) {
		
		int cnt = 1; // dvd 장수
		int sum = 0; // dvd에 담아내는 곡 수
		
		for(int x : arr) {
			if(sum+x>capacity) { // 현재 용량 + 담을 곡 용량 > 용량
				cnt++; // 새로운 장수 증가
				sum=x; // 새로운 장에 담을 곡 용량만큼 추가
			}
			else sum+=x; // 용량 안차면 dvd에 곡 담기
		}
		
		return cnt;
	}
	
	
	public static int solution(int n, int m, int[] arr) {
		
		int answer = 0;
		
		int lt = Arrays.stream(arr).max().getAsInt();
		int rt = Arrays.stream(arr).sum();
		
		while(lt<=rt) {
			
			int mid = (lt+rt)/2;
			
			if(count(arr,mid)<=m) {
				answer = mid;
				
				rt = mid-1;
			}
			else {
				lt = mid+1;
			}
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, m, arr));
		
	}
	
	
	
	
	
	
}
