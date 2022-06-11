package patter_printing_questions;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int nsp = n - 1;
		int nst = 1;
		int row = 1;
		// row
		while (row <= n) {
			// spaces work
			int csp = 1;
			while (csp <= nsp) {
				System.out.print(" ");
				csp++;
			}
			// stars work
			int cst = 1;
			while (cst <= nst) {
				System.out.print("*");
				cst++;
			}
			// prep
			System.out.println();
			nst++;
			nsp--;
			row++;

		}
	}
}