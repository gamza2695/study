package section06_Sorting_Searching;

import java.util.Scanner;

public class P01 { // 6-1 선택정렬
	
	
	public static int[] solution(int n,int[] arr) {
	
		for(int i=0; i<n-1; i++) { // 마지막 전까지만 돌아도 ok
			int idx = i;
			for(int j=i+1; j<n; j++) { // j는 i+1부터 돌면서 가장 작은 값의 index 저장
				if(arr[j]<arr[idx]) idx = j;
			}
			int tmp = arr[i]; // 구한 index와 i번째의 요소를 swap
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : solution(n, arr)) System.out.print(x + " ");		
		
	}

}
