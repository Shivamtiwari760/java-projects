package coding_blocks_crux_online;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0) {
			System.out.println(n +" is a even");
		}
		else {
			System.out.println( n +" is odd number");
		}
	}

}
