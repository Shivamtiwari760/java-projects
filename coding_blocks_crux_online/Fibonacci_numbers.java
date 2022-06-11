package coding_blocks_crux_online;

import java.util.Scanner;

public class Fibonacci_numbers {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int sum = a + b;
		int counter = 1;
		while (counter <= n+1) {
			System.out.println(a);
			sum = a + b;
			a = b;
			b = sum;
			counter = counter + 1;
		}
		
	}

}
