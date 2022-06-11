package patter_printing_questions;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		while(row<=n) {
			int col=1;
			while(col<=n) {
				System.out.print("*");
				col++;
			}
			System.out.println();
			row++;
		}

	}

}
