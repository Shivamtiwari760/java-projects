package coding_blocks_crux_online;

import java.util.Scanner;

public class Sum_of_first_n_natural_numbers {

	public static void main(String[] shivam) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int counter = 1;
		int sum = 0;
		while (counter <= n) {
			sum = sum + counter;
			counter = counter + 1;
		}
		System.out.println(sum);
	}

}
