package patter_printing_questions;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int row = 1; row <= n; row++) {
			for (int coloumn = 1; coloumn <= n; coloumn++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
