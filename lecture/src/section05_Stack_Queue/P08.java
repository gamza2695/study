package section05_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P08 { // 5-8 응급실
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println(T.solution(n, m, arr));
		
		
	}

}

class Person{
	int id; // 처음 대기목록 순서값
	int priority; // 위험도
	
	public Person(int id, int priority) {
		this.id = id;
		this.priority = priority;
	}
}


class Main{
	
	public int solution(int n, int m, int[] arr) {
		
		int answer = 0;
		
		Queue<Person> Q = new LinkedList<>(); // Person형 Queue 만들기
		
		for(int i=0; i<n; i++) { // Person 객체 생성해서 Q에 넣기
			Q.add(new Person(i, arr[i]));
		}
		
		while(!Q.isEmpty()) {
			
			Person tmp = Q.poll(); // Q에서 꺼내보기
			for(Person x : Q) { // Q 요소 하나하나 비교
				if(x.priority > tmp.priority) { // x가 tmp보다 우선순위가 높으면
					Q.offer(tmp); // 뒤로넣기
					tmp = null;
					break;
				}
			}
			if(tmp!=null) { // tmp가 null이 아니면 진료받는다
				answer++;
				if(tmp.id == m) return answer; // 진료순서가 m과 같으면 answer 리턴
			}
		}
		
		return answer;
		
	}
}