package section08_DFS_BFS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P05 { // 8-5 동전교환
	
	static int n, m, answer = Integer.MAX_VALUE;
	
	public void DFS(int L, int sum, Integer[] arr) {
		
		if(sum>m) return; // sum이 금액 넘어가면 리턴
		if(L>=answer) return; // 시간복잡도 줄이기
		
		if(sum==m) { // sum이 금액 도달
			answer = Math.min(answer, L);
		}
		else {
			for(int i=0; i<n; i++) { // n가닥 뻗어나감
				DFS(L+1, sum+arr[i], arr);
			}
		}
	}
	
	public static void main(String[] args) {
		P05 T = new P05();
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 동전 종류 개수
		
		Integer[] arr = new Integer[n]; // 동전종류 넣기
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
 		}
		Arrays.sort(arr, Collections.reverseOrder()); // 시간복잡도 줄이기-> 5,2,1순으로 구한다 
													  //Collections.reverseOrder 사용하려면 arr -> Integer로 선언
		
		m = sc.nextInt(); // 금액
		
		T.DFS(0, 0, arr); // DFS(L, Sum, 배열(지역변수로 선언했으므로 넘겨줌)
		System.out.println(answer);
	}
}
