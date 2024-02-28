package section07_Recursive_Tree_Graph;

public class P02 { // 7-2 이진수 출력(재귀)
	
	
	public void DFS(int n) {
		
		if(n==0) return;
		else {
			DFS(n/2);
			System.out.print(n%2);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		P02 P = new P02();
		
		P.DFS(11);
	}

}
