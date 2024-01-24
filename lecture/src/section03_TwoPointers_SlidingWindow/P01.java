package section03_TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P01 { // 3-1 두 배열 합치기
	
	
	public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
		
		// ====== 내 풀이 ======
//		int[] arr = new int[n1+n2];
//		
//		for(int i=0; i<n1; i++) {
//			arr[i] = arr1[i];
//		}
//		for(int i=n1; i<n1+n2; i++) {
//			arr[i] = arr2[i-n1];
//		}
//		
//		Arrays.sort(arr);
//		
//		System.out.println(Arrays.toString(arr));
		
		// ====== 쌤 풀이 ======
		// 이 문제는 sort 이용해서 푸는 게 아님!
		// sort 이용 시 O(n long n)으로 960000번
		// O(n)으로 짜봐라 60000번으로
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		int p1 = 0, p2 = 0;
		
		while(p1<n && p2<m) { // p1과 p2 둘 중 하나가 n,m에 도달하면 (거짓이면) 끝남
			
			// a[p1]과 b[p2] 비교해서 answer ArrayList에 추가하기
			if(a[p1] < b[p2]) answer.add(a[p1++]); // p1이 가리키는 값이 add되고 증가됨
			else answer.add(b[p2++]);
		}
		
		// p2가 m에 도달해서 첫번째 while문을 나왔을 때 (남은 p1 처리)
		while(p1<n) answer.add(a[p1++]);
		
		// p1이 n에 도달해서 첫번째 while문을 나왔을 때 (남은 p2 처리)
		while(p2<m) answer.add(b[p2++]);
		
		return answer;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int n1 = sc.nextInt();
//		int[] arr1 = new int[n1];
//		for(int i=0; i<n1; i++) {
//			arr1[i]=sc.nextInt();
//		}
//		
//		int n2 = sc.nextInt();
//		int[] arr2 = new int[n2];
//		for(int i=0; i<n2; i++) {
//			arr2[i]=sc.nextInt();
//		}
//		
//		solution(n1, n2, arr1, arr2);
		
		
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			b[i] = sc.nextInt();
		}
		
		for(int x : solution(n, m, a, b)) System.out.print(x+" ");
		
		
	}



}
