package section02_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P01 { // 2-1 큰 수 출력하기

	public static String solution(int n,String s){
		
		
		// ====== 내 풀이 ======
		// 입력부터 String으로 한줄로 받는 건 줄 알았는데 입력을 int[] 배열로 받음..
		// 1. String으로 받은 배열을 split으로 나눠서 String 배열로 만들고, String 배열을 int 배열로 변환
		// 2. 답을 넣을 list 선언
		// 3. for문 이용해서 int 배열에서 앞수보다 큰 수만 list에 넣기
		
		String answer = "";
		
		String[] numStr = s.split(" ");
		int[] num = new int[numStr.length];
		
		for(int i=0; i<num.length;i++) {
			num[i] = Integer.parseInt(numStr[i]);
			System.out.println(num[i]);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(num[0]);
		
		for(int i=1; i<num.length;i++) {
			if(num[i]>num[i-1]) {
				list.add(num[i]);
			}	
		}
		
		answer = list.toString();
		
		return answer;
	}

	public static void main(String[] args){

		int n = 6;
		String s = "7 3 9 5 6 12";
		
		System.out.println(solution(n,s));
		
	
	}
	
	// ====== 쌤 풀이 ======
//	
//	public ArrayList<Integer> solution(int n, int[] arr){
//		ArrayList<Integer> answer = new ArrayList<>();
//		
//		answer.add(arr[0]);
//		for(int i=1; i<n; i++) {
//			if(arr[i]>arr[i-1]) answer.add(arr[i]);
//		}
//		return answer;
//	}
//	
//	public static void main(String[] args) {
//		Main T = new Main();
//		Scanner kb= new Scanner(System.in);
//		int n = kb.nextInt();
//		int[] arr= new int[n];
//		for(int i=0; i<n; i++) {
//			arr[i]=kb.nextInt();
//		} 
//		for(int x:T.solution(n,arr)) {
//			System.out.print(x+" ");
//		}
//	}
	
	
	
	
	
	
}
