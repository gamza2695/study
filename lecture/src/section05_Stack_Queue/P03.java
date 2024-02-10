package section05_Stack_Queue;

import java.util.Scanner;
import java.util.Stack;

public class P03 { // 5-3 크레인 인형뽑기(카카오)
	
	
	public static int solution(int n, int[][] board, int m, int[] moves) {
		
		int answer = 0;

		
//		Stack<Integer> result = new Stack<>();
//		
//		int[] outBoard = new int[n];
//
//			outBoard말고 그냥 board안의 요소를 0으로 바꾸자!
//		for(int move : moves) {
//			
//			if(outBoard[move-1] == n) continue;
//			
//			result.push(board[outBoard[move-1]++][move-1]);
//
//		}
//		
//			↓이렇게 하면 안됨!! 반복문돌리면서 없애야 그아래있는거랑 같이 제거됨...
//		for(int i=1; i<result.size(); i++) {
//			if(result.get(i-1) == result.get(i)) answer++;
//		}
		
		Stack<Integer> stack = new Stack<>();
		
		for(int pos : moves) { // moves 순서대로 반복하기
			
			for(int i=0; i<board.length; i++) { // 0이 아닌곳까지 내려가서 인형 가져오기
				if(board[i][pos-1]!=0) { // 인형이 있으면
					int tmp = board[i][pos-1];
					board[i][pos-1] = 0; // 인형가져오고 board요소는 0으로 바꾸기
					
					if(!stack.isEmpty() && tmp == stack.peek()) { // stack이 비어있지 않고, 인형이 stack 맨 마지막 요소와 같다면
																// pop()은 빼내오는 것 , peek()는 위에서 보는것
						answer+=2;
						stack.pop(); // 두개 중복-> 제거! tmp를 넣는게 아니라 그 마지막 요소를 꺼내는 것
					}
					else stack.push(tmp); // 맨 마지막 요소와 다르면 stack에 그냥 넣는다
					break; // ***0이 아닌곳까지 내려가서 인형가져오고 그다음이 또 0이 아니면 반복되므로 break 해주기
				}
			}
		}

		
		return answer;
			
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// nxn 격자
		int n = sc.nextInt();
		int[][] board = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		// 뽑기 순서
		int m = sc.nextInt();
		int[] moves = new int[m];
		
		for(int i=0; i<m; i++) {
			moves[i] = sc.nextInt();
		}
		
		System.out.println(solution(n, board, m, moves));
		
		
		
		
		
		
	}

}
