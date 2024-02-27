package section06_Sorting_Searching;

import java.util.Arrays;
import java.util.Scanner;

public class P10 { // 6-10 마구간 정하기(결정알고리즘)
	
	public static int count(int[] arr, int dist) {
		
		int cnt = 1; // 말 마릿수
		int ep = arr[0]; // 이전 말의 마구간 좌표
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] - ep >= dist) { // 현재 마구간 좌표 - 이전 마구간 좌표가 주어진 거리보다 크거나 같으면
				cnt++; // 말 배치하기
				ep = arr[i];
			}
		}
		
		return cnt;
		
	}
	
	
	public static int solution(int n, int c, int[] arr) {
		
		int answer = 0;
		
		Arrays.sort(arr); // 오름차순으로 정렬하기(좌표로 만들기)
		
		int lt = 1;
		int rt = arr[n-1]; // 임의로 이렇게 하는 게 좋음
		
		while(lt<=rt) {
			
			int mid = (lt+rt)/2;
			
			if(count(arr, mid)>=c) { // 마구간의 말이 모두 배치가능하다면
				answer = mid; 
				lt = mid+1; // 최대값 더 찾기
			}
			else {
				rt = mid-1; // 마구간 말 배치 다 못할 경우
			}
			
			
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int c = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, c, arr));
	}

}
