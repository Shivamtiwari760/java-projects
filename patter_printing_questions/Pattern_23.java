package patter_printing_questions;

import java.util.Scanner;

public class Pattern_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<=n;j++) {
				System.out.print('*');
				System.out.print('*');
				System.out.print('*');
				System.out.print('*');
				
				System.out.print('*');
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
