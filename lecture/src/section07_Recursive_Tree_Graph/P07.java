package section07_Recursive_Tree_Graph;

import java.util.LinkedList;
import java.util.Queue;

class Node2{
	int data;
	Node2 lt, rt;
	public Node2(int val) {
		data = val;
		lt=rt=null;
	}
}

public class P07 { // 7-7 이진트리 레벨탐색(BFS)

	Node2 root;
	
	public void BFS(Node2 root) {
		
		Queue<Node2> Q = new LinkedList<>();
		Q.offer(root);
		
		int L = 0; // 레벨
		while(!Q.isEmpty()) { // 비어있지 않으면 계속 반복
			int len = Q.size();
			System.out.print(L + " : "); // 레벨 출력
			
			// 해당 레벨의 원소 출력
			for(int i=0; i<len; i++) {
				Node2 cur = Q.poll(); // 현재요소를 큐에서 꺼내기
				System.out.print(cur.data+" ");
				
				if(cur.lt!=null) Q.offer(cur.lt); // 연결된 요소 lt가 null이 아니면 큐에 lt 넣기
				if(cur.rt!=null) Q.offer(cur.rt); // 연결된 요소 rt가 null이 아니면 큐에 rt 넣기
				
			}
			
			L++; // 레벨 증가
			System.out.println();
		}
		
	}
	
	
	public static void main(String[] args) {
		
		P07 tree = new P07();
		tree.root = new Node2(1);
		tree.root.lt = new Node2(2);
		tree.root.rt = new Node2(3);
		tree.root.lt.lt = new Node2(4);
		tree.root.lt.rt = new Node2(5);
		tree.root.rt.lt = new Node2(6);
		tree.root.rt.rt = new Node2(7);
		tree.BFS(tree.root); // 100번지
		
	}

}
