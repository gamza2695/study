package section06_Sorting_Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class P07 { // 6-7 좌표 정렬
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		ArrayList<Point> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			arr.add(new Point(x, y));
		}
		
		Collections.sort(arr);
		
		for(Point o : arr) {
			System.out.println(o.x + " " + o.y);
		}
			
	}

}

class Point implements Comparable<Point>{
	
	public int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
	@Override
	public int compareTo(Point o) {
		if(this.x == o.x) return this.y-o.y; // this객체와 매개변수로 넘어온 object 객체 순으로 만드려면 음수값이 리턴되어야 함 (?..)
		else return this.x-o.x;
		
		// 내림차순
		// if(this.x == o.x) return o.y-this.y;
		// else return o.x-this.x;
	}
	
}