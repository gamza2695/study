package section09_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
	public int s, e;
	Time(int s, int e){
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(Time o) {
		if(this.e == o.e) return this.s - o.s; // 끝나는 시간 같으면 시작시간으로 오름차순 정렬
		else return this.e - o.e; // 다르면 끝나는 시간으로 정렬
	}
}

public class P02 { // 9-2 회의실 배정
		
	public int solution(ArrayList<Time> arr, int n) {
		int cnt = 0;
		
		Collections.sort(arr); // compareTo에 의해 정렬
		int et = 0;
		for(Time ob : arr) {
			if(ob.s >= et) {
				cnt++;
				et = ob.e;
			}
		}
		return cnt;
	}
		
	public static void main(String[] args) {
		
		P02 T = new P02();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr.add(new Time(x,y));
		}
		System.out.println(T.solution(arr, n));
		
		
		
	}

}
