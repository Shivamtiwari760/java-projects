package coding_blocks_crux_online;

import java.util.Scanner;

public class Prime_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag = true;
		int divisor = 2;
		while (divisor <= n - 1) {
			if (n % divisor == 0) {
				flag = false;
			}
			divisor = divisor + 1;
		}
		if (flag ==true) {
			System.out.println("the number is prime");
		}
		else {
			System.out.println("the number is not prime");
		}
	}

}
