package section07_Recursive_Tree_Graph;

public class P06 { // 7-6 부분집합 구하기(DFS)
	
	static int n; // 집합 원소 개수
	static int[] ch; // 해당 숫자를 부분집합으로 할지 안할지 체크
	
	public void DFS(int L) {
		
		if(L==n+1) {
			String tmp = "";
			
			for(int i=1; i<=n; i++) { // 체크배열에서 1을 가진 인덱스 구하기
				if(ch[i]==1) tmp += (i+ " ");
			}
			
			if(tmp.length()>0) System.out.println(tmp); // 공집합이 아닌 경우에만 출력
			
		}
		else {
			
			ch[L] = 1; // 사용 o 체크
			DFS(L+1); // D(1) 왼쪽(o)으로 뻗는 것 // 여기까지 stack 쌓이고 팝되고 부분집합 기록
			
			// 다시 복귀 후 아래 코드 실행됨 
			ch[L] = 0; // 사용 x 체크
			DFS(L+1); // D(1) 오른쪽(x)으로 뻗는 것
		}
		
	}

	public static void main(String[] args) {
		
		P06 T= new P06();
		 
		n=3;
		ch = new int[n+1];
		T.DFS(1);
		
		
	}

}
