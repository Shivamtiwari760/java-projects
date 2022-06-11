package p1;

import java.util.Scanner;

public class Doubt1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		if(n%2==1) {
			System.out.println("the number is odd");
		}
		else if(n%2==0) {
			System.out.println("the number is even");
		}
		else {
			System.out.println("invalid input");
		}

	}

}
