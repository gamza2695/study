package ch03_greedy;

import java.util.Arrays;
import java.util.Scanner;

public class P01 { // 실전 3-2 큰 수의 법칙
	
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		int result = 0;
		
		// n, m, k를 공백을 기준으로 구분하여 입력 받기
		// n개의 숫자, m번 더하기, k번 초과 가능
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		// n개의 수를 공백을 기준으로 구분하여 입력 받기
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 입력 받은 수 정렬하기
		Arrays.sort(arr);

		// 왜 두 수만 구하면 되는가? 2,4,5,6,5 -> (6,6,6,5,6,6,6,5) 이런식으로 중간에 두번째로 큰수만 들어가면 가장 큰 수를 계속 더할 수 있음
		// 가장 큰 수 
		int firstNo = arr[n-1];
		// 두번째로 큰 수
		int secondNo = arr[n-2];
	
		
		// 가장 큰 수 가 더해지는 횟수 계산
		int cnt = (m/(k+1))*k; // m번 / (k번+다른수 1번) * k 
		cnt += m%(k+1); // 나누어 떨어지지 않을 때 나머지수도 가장 큰수 k이므로 cnt에 더하기
		
		// 가장 큰 수 더하기
		result += cnt*firstNo;
		// 두번째로 큰 수 더하기
		result += (m-cnt)*secondNo;
		
		
		// 답 구하기
		System.out.println(result);
	}

}
