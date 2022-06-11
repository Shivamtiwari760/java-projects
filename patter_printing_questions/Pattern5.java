package patter_printing_questions;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
