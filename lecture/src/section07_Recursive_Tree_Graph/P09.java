package section07_Recursive_Tree_Graph;

// 7-9 Tree 말단노드까지의 가장 짧은 경로(DFS)

class Node3{
	
	int data;
	Node3 lt, rt;
	public Node3(int val) {
		data = val;
		lt=rt=null;
	}
}

public class P09 { 

	Node3 root;
	
	public int DFS(int L, Node3 root) {
		
		if(root.lt==null && root.rt == null) { // 말단 노드인 경우
			return L; // level = 거리 리턴
		}
		else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt) ); // 각 노드의 자식이 두개 다 있어야 함 
		// 각 자식의 DFS의 값이 재귀함수로 구해져서 그 중 작은 값 리턴
		
	}
	
	public static void main(String[] args) {
		P09 tree = new P09();
		
		tree.root = new Node3(1);
		tree.root.lt = new Node3(2);
		tree.root.rt = new Node3(3);
		tree.root.lt.lt = new Node3(4);
		tree.root.lt.rt = new Node3(5);
		System.out.println(tree.DFS(0, tree.root));
	}
	
	
}
