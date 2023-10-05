package section01_String;

public class P05 {
	public static String solution(String str) {
		
		char[] s = str.toCharArray();
		
		
		for(int lt = 0 ; lt<)
		
		
		
		for(int i = 0; i<str.length(); i++) {
			int lt = 0, rt = str.length()-1;

			if((s[i]>='a' && s[i]<='z') || (s[i]>='A' && s[i]<='Z')){
				
				while(lt<rt) {
					char tmp = s[lt];
					s[lt] = s[rt];
					s[rt]=tmp;
					lt++;
					rt--;
				}
			}
			
			
		}
		

		
		
		return str;
	}
		

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(solution(str));
	}
}