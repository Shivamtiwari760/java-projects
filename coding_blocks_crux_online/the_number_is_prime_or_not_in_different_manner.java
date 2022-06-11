package coding_blocks_crux_online;

import java.util.Scanner;

public class the_number_is_prime_or_not_in_different_manner {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		int n = sc.nextInt();
		int divisor=2;
		boolean flag=false;
		while(divisor<=n-1) {
			if(n%divisor==0) {
				flag=true;
			}
			divisor=divisor+1;
		}
		if(flag==true) {
			System.out.println("the number is not prime");
		}
		else {
			System.out.println("the number is prime");
		}


	}

}
