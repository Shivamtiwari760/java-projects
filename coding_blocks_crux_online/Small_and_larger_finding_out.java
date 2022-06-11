package coding_blocks_crux_online;

import java.util.Scanner;

public class Small_and_larger_finding_out {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char ch=sc.next().charAt(0);
		if(ch=='a' && ch=='z') {
			System.out.println("small leter");
		}
		else {
			System.out.println("capital letter ");
		}
	}

}
