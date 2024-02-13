package section05_Stack_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P06 { // 5-6 공주 구하기

	public static int solution(int n, int k) {
		
		int answer = 0;

		Queue<Integer> Q = new LinkedList<>();
		
		for(int i=1; i<=n; i++) Q.offer(i); // n까지 숫자 Q에 넣기
		
		while(!Q.isEmpty()) { // 비어있지 않으면 true 반복
			
			for(int i=1; i<k; i++) { // 주어진 숫자 k전까지는
				Q.offer(Q.poll()); // Q에서 빼서 다시 뒤로 넣기
			}
			Q.poll(); // k인 경우는 그냥 poll
			
			if(Q.size()==1) answer = Q.poll();// 1개가 남으면 poll해서 answer에 값을 넣기 -> poll되므로 Q의 사이즈는 0이 된다
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		
		System.out.println(solution(n, k));
		
		
	}

}
