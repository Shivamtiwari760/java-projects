package patter_printing_questions;

import java.util.Scanner;

public class Pattern0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			// work
			System.out.print("*");
			// preparation for the next row
			System.out.print("\n");
		}

	}

}
