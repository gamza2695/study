package section06_Sorting_Searching;

import java.util.Scanner;

public class P03 { // 6-3 삽입정렬
	
	public static int[] solution(int n, int[] arr) {
		
		
		for(int i=1; i<n; i++) {
			
			int tmp = arr[i]; // 나중에 삽입될 요소
			int j; // j 여기서 선언!
		
			for(j=i-1; j>=0; j--) {
				if(arr[j]>tmp) arr[j+1] = arr[j]; // arr[j]가 tmp보다 크면 뒤로 밀기 
				else break;
			}
			arr[j+1] = tmp;
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
