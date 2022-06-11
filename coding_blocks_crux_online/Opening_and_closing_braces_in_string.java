package coding_blocks_crux_online;

import java.util.Scanner;

public class Opening_and_closing_braces_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		String str=sc.next();
		String str="(((((())))))";
		int count1=0;
		int count2=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='(') {
				count1++;
			}
			else if(str.charAt(i)==')'){
				count2++;
			}
		}
		if(count1==count2) {
			System.out.println("no error");
		}
		else {
			System.out.println("error in the program");
		}

	}

}
