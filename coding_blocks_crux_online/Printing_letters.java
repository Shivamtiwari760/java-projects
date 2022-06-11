package coding_blocks_crux_online;

import java.util.Scanner;

public class Printing_letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int i;
		for (i = 0; i < name.length(); i++) {
			if (name.length()=='a' && name.length() == 'z') {
				System.out.println("all are small letter and we dont need that");
			}
			else {
				System.out.println("capital lettes that needed to be printed out");
			}
			
		}
		char a = name.charAt(i);
		System.out.println(a + ", ");

	}
}
