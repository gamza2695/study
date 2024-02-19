package section06_Sorting_Searching;

import java.util.Scanner;

public class P02 { // 6-2 버블정렬
	
	public static int[] solution(int n, int[] arr) {
		
		
		for(int i=0; i<n-1; i++) { // n개니까 n-1까지 반복하면 된다
			for(int j=0; j<n-i-1; j++) { // 반복횟수는 줄어들게
				if(arr[j]>arr[j+1]) { // 이웃한 수와 비교해서 뒤가 더 작으면 swap
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
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
