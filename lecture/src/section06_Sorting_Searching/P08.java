package section06_Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class P08 { // 6-8 이분검색
	
	
	public static int solution(int n, int m, int[] arr) {
		int answer = 0; 
		
		Arrays.sort(arr);
		
		int lt = 0, rt = n-1;
		
		while(lt<=rt) { // 이분검색 방법
			int mid = (lt+rt)/2;
			
			if(arr[mid]==m) {
				answer = mid+1;
				break;
			}
			if(arr[mid]>m) rt = mid-1;
			else lt = mid+1;
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
