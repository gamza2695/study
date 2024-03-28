package section07_Recursive_Tree_Graph;

//7-10 Tree 말단노드까지의 가장 짧은 경로(BFS)

import java.util.LinkedList;
import java.util.Queue;

class Node4{
	int data;
	Node4 lt, rt;
	
	public Node4(int val) {
		data = val;
		lt = rt = null;
	}
}

public class P10 { 
	
	Node4 root;
	public int BFS(Node4 root) {
		Queue<Node4> Q = new LinkedList<>();
		Q.offer(root);
		
		int L=0;
		while(!Q.isEmpty()) { // Q가 비어있지 않다면 계속 반복
			int len = Q.size(); // 레벨의 요소 개수 구하기
			for(int i=0; i<len; i++) { // 레벨에 있는 노드 꺼내기
				Node4 cur = Q.poll(); // 현재 노드 꺼내기
				if(cur.lt==null && cur.rt==null) return L; // 자식 노드 없다면 레벨(길이) 리턴
				if(cur.lt!=null) Q.offer(cur.lt); // 자식노드(lt)가 있다면 넣기
				if(cur.rt!=null) Q.offer(cur.rt); // 자식노드(rt)가 있다면 넣기
				
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {
		P10 tree = new P10();
		tree.root = new Node4(1);
		tree.root.lt = new Node4(2);
		tree.root.rt = new Node4(3);
		tree.root.lt.lt = new Node4(4);
		tree.root.lt.rt = new Node4(5);
		System.out.println(tree.BFS(tree.root));
	}
}
