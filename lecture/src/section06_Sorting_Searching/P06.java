package section06_Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class P06 { // 6-6 장난꾸러기
	
	public static int[] solution(int n, int[] arr) {
		
		int[] answer = new int[2];
		int[] arr2 = Arrays.copyOf(arr, n);
		// int[] arr2 = arr.clone();
		Arrays.sort(arr);
		int k=0;
		
		for(int i=0; i<n; i++) {
			if(arr[i]!=arr2[i]) answer[k++] = i+1;
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
		
		for(int x : solution(n, arr)) System.out.print(x + " ");	
	}

}
