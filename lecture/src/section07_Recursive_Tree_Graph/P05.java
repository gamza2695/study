package section07_Recursive_Tree_Graph;


class Node{
	int data;
	Node lt, rt; // 왼쪽, 오른쪽 자식 노드 객체 주소 저장
	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class P05 { // 7-5 이진트리 순회(깊이우선탐색)
	
	Node root;

	public void DFS(Node root) {
		
		if(root==null) return; // 말단 노드인 경우 리턴
		else { // 계속 재귀돌면서 lt,rt 반복
			
			// 전위 순회
//			System.out.print(root.data + " ");
			DFS(root.lt);
			// 중위 순회
//			System.out.print(root.data + " ");
			DFS(root.rt);
			// 후위 순회
//			System.out.print(root.data + " ");
			
		}
	}
	
	
	public static void main(String[] args) {
		
		P05 tree = new P05();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);
		
		
	}

}
