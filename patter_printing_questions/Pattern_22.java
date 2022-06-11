package patter_printing_questions;

import java.util.Scanner;

public class Pattern_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int row=1;row<=n;row++) {
			for(int column=1;column<=n;column++) {
				System.out.print('*');
			}
			System.out.println();
		}
		
	}
}