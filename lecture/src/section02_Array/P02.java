package section02_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02 {
	public static int solution(int n,int[] arr){
		
		// ====== 내 풀이 ======
		// list만들어서 넣어줌
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);
		
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>list.get(list.size()-1)) {
				list.add(arr[i]);
			}
		}
		
		
		return list.size();
		
		
		// ====== 쌤 풀이 ======
		// 간단해..ㅠ
		
//		int answer =1, max = arr[0];
//		for(int i=1; i<n; i++) {
//			if(arr[i]<max) {
//				answer++;
//				max = arr[i];
//			}
//		}
		
		
		
		
	}

	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = kb.nextInt();
		}
		
		System.out.println(solution(n,arr));
	
	}
}
