package section02_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03 {
	public static List<String> solution(int n,int[] arrA, int[] arrB){

		
		// ====== 내 풀이 ======
		List<String> answer = new ArrayList<String>();
		
		
		for(int i=0; i<n; i++) { // 중복 많음...
			
			if(arrA[i]==arrB[i]) answer.add("D");
			else if(arrA[i]==1) {
				switch(arrB[i]) {
				case 2 : answer.add("B"); break;
				case 3 : answer.add("A"); break;
				}
			}
			else if(arrA[i]==2) {
				switch(arrB[i]) {
				case 1 : answer.add("A"); break;
				case 3 : answer.add("B"); break;
				}
			}
			else if(arrA[i]==3) {
				switch(arrB[i]) {
				case 1 : answer.add("B"); break;
				case 2 : answer.add("A"); break;
				}
			}
				
		}
		
		
		
		// ====== 쌤 풀이 ======
		// if 비기는 경우
		// else if a가 1로 이기는 경우
		// else if a가 2로 이기는 경우
		// else if a가 3로 이기는 경우
		// else b가 이기는 경우

//		String answer="";
//		for(int i=0; i<n; i++) {
//			if(a[i]==b[i]) answer +="D";
//			else if(a[i]==1 && b[i]==3) answer+="A";
//			else if(a[i]==2 && b[i]==1) answer+="A";
//			else if(a[i]==3 && b[i]==2) answer+="A";
//			else answer+="B";
//		}
//		return answer;
		
		
		return answer;
	}

	public static void main(String[] args){

		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		int[] arrA = new int[n];
		for(int i=0;i<n;i++) {
			arrA[i] = kb.nextInt();
		}
		int[] arrB = new int[n];
		for(int i=0;i<n;i++) {
			arrB[i] = kb.nextInt();
		}
		
		
		System.out.println(solution(n,arrA,arrB));
		
//		int[] a = new int[n];
//		int[] b = new int[n];
//		for(int i=0;i<n;i++) {
//			a[i] = kb.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			b[i] = kb.nextInt();
//		}
//		for(char x : solution(n,a,b).toCharArray()) System.out.println();
	}
}
