package section07_Recursive_Tree_Graph;

public class P01 { // 7-1 재귀함수(스택프레임)
	
	
	public void DFS(int n) {
		
		if(n==0) return;
		else {
			DFS(n-1);
			System.out.print(n + " ");
		}
	}
	
	
	
	public static void main(String[] args) {
		
		P01 P = new P01();
		
		P.DFS(3);
		
	}

}
