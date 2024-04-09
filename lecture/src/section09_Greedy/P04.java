package section09_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture>{
	public int money;
	public int time;
	
	Lecture(int money, int time){
		this.money = money;
		this.time = time;
	}
	
	@Override
	public int compareTo(Lecture ob) {
		return ob.time - this.time;
	}
}

public class P04 { // 9-4 최대수입스케줄(PriorityQueue)
	
	static int n, max = Integer.MIN_VALUE;
	public int solution(ArrayList<Lecture> arr) {
		int answer = 0;
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); // 제일 큰 값을 우선순위로 꺼냄
		
		Collections.sort(arr); // 내림차순 정렬
		
		int j = 0;
		for(int i=max; i>=1; i--) { // 날짜 3->2->1
			for( ; j<n; j++) {
				if(arr.get(j).time<i) break; // 날짜까지 break;
				pQ.offer(arr.get(j).money); // 강연료 넣기
			}
			if(!pQ.isEmpty()) answer += pQ.poll(); // 가장 큰값 poll -> 강연료에 넣기
		}
		
		return answer;
		
		
	}
	
	public static void main(String[] args) {
		P04 T = new P04();
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		ArrayList<Lecture> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			arr.add(new Lecture(m,d));
			if(d>max) max = d; // 날짜 중 가장 큰 값
		}
		System.out.println(T.solution(arr));
		
		
	}
}
