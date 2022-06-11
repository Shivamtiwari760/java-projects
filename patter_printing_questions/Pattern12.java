package patter_printing_questions;

import java.util.Scanner;

public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int nsp=0;
		int nst=n;
		while(row<=n) {
			// stars
			int cst=1;
			while(cst<=nst) {
				System.out.println("*");
				cst++;
			}
			int csp=1;
			while(csp<=nsp) {
				System.out.println(" ");
				csp++;
			}
			System.out.println();
			row++;
			nsp++;
			nst--;
		}

	}

}
