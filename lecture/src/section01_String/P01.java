package section01_String;

import java.util.Scanner;

public class P01 {
	public static int solution(String input1, char input2) {
		
		int count = 0;
		input1 = input1.toUpperCase();
		input2 = Character.toUpperCase(input2);
		
		for(int i = 0 ; i<input1.length();i++) {
			if(input1.charAt(i) == input2) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		char input2 = sc.next().charAt(0);
		
		System.out.println(solution(input1, input2));
	}
}
