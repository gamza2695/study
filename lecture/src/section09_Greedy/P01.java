package section09_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
	public int h, w;
	Body(int h, int w){
		this.h = h;
		this.w = w;
	}
	
	@Override
	public int compareTo(Body o) {
		return o.h - this.h; // h로 내림차순
	}
}


public class P01 { // 9-1 씨름 선수
	
	public int solution(ArrayList<Body> arr, int n) {
		int cnt = 0;
		
		Collections.sort(arr); // 내림차순 정렬
		
		int max = Integer.MIN_VALUE;
		for(Body ob : arr) { // 몸무게 더 무거우면 count
			if(ob.w > max) {
				max = ob.w;
				cnt++;
			}
		}
		
		
		return cnt;
	}
	
	public static void main(String[] args) {
		P01 T = new P01();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Body> arr = new ArrayList<>(); // 키, 몸무게 Body 객체 arr에 넣기
		for(int i=0; i<n; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			arr.add(new Body(h,w));
		}
		
		System.out.println(T.solution(arr, n));
		
	}
}
