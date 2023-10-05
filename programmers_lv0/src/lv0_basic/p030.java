package lv0_basic;

public class p030 {
	public static void main(String[] args) {
		
		int[] arr = {0,1,2,4,3};
		int[][] queries = {{0,4,2},
				{0,3,2},
				{0,2,2}};
		
		int[] answer = new int[queries.length];
		int min = MAX
		
		for(int i = 0; i<queries.length; i++) {
			
			for(int j = queries[i][0]; j<=queries[i][1]; j++) {	
				
				if(arr[j]>queries[i][2] || arr[j]<min) {
					min = arr[j];
					answer[i] = min;
				}
				else {
					answer[i] = -1;
				}
				
			}
			
		}
		
		for(int k : answer) {
			System.out.println(k);
		}
	}
}
