package patter_printing_questions;

import java.util.Scanner;

public class pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int nsp=n-1;
		int nst=1;
		int row=1;
		while(row<=n) {
			int csp=1;
			while(csp<=nsp) {
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst) {
				System.out.print('*');
				cst++;
			}
			System.out.println();
			nst++;
			nsp--;
			row++;
			
		}
		
		
		
		
		

	}

}
