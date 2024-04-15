package section10_DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick>{ // 벽돌객체
	public int s, h, w;
	Brick(int s, int h, int w){
		this.s = s;
		this.h = h;
		this.w = w;
	}
	
	@Override
	public int compareTo(Brick o) {
		return o.s-this.s; // s 기준 내림차순 정렬
	}
}

public class P04 { // 10-4 가장 높은 탑 쌓기

	static int[] dy;
	public int solution(ArrayList<Brick> arr) {
		int answer = 0;
		
		Collections.sort(arr); // s 기준 내림차순 정렬
		dy[0] = arr.get(0).h;
		answer  = dy[0];
		
		for(int i=1; i<arr.size(); i++) {
			int max_h=0;
			for(int j=i-1; j>=0; j--) {
				if(arr.get(j).w>arr.get(i).w && dy[j]>max_h) { // 무게가 가볍고 dy[j]중 가장 최대값일때
					max_h = dy[j];
				}
			}
			dy[i] = max_h + arr.get(i).h;
			answer = Math.max(answer, dy[i]);
		}
		
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		P04 T = new P04();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<Brick> arr = new ArrayList<>();
		dy = new int[n];
		for(int i=0; i<n; i++) { // 벽돌정보 ArrayList에 추가
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr.add(new Brick(a,b,c));
		}
		System.out.println(T.solution(arr));
		
		
	}
	
	
}
