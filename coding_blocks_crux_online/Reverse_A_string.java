package coding_blocks_crux_online;

import java.util.Scanner;

import javax.print.attribute.SetOfIntegerSyntax;

public class Reverse_A_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str="Shivam tiwari";
		int i;
		for(i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
			
		}
		

	}

}
