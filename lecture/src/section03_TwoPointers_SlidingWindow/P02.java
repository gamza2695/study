package section03_TwoPointers_SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class P02 { // 3-2 공통원소 구하기 == 교집합 구하기
	
	public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
		
		ArrayList<Integer> answer = new ArrayList<>();
		
		// 1. 배열 a와 b를 오름차순 정렬해준다 (차례차례 비교해나갈것)
		Arrays.sort(a);
		Arrays.sort(b);
		
		int p1 = 0, p2 = 0;
		
		// 2포인트 알고리즘 사용
		// p1과 p2 둘 중 하나가 끝날 때(n, m에 도달할 때)까지 반복
		while(p1<n && p2<m) {
			if(a[p1] == b[p2]){ // a[p1]과 b[p2]가 같으면 answer 배열에 넣고 각각 다음칸으로 이동
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++; // a[p1]이 b[p2]보다 작으면 p1 다음칸으로 이동
			else p2++; // b[p2]가 작으면 p2 다음칸으로 이동
		}
		
		return answer;
		
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
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
		
		for(int x : solution(n, m, a, b)) System.out.print(x + " ");

	}

}
