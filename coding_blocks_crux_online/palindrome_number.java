package coding_blocks_crux_online;

import java.util.Scanner;

public class palindrome_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		int n=sc.nextInt();
		int n=90;
		int rem;
		int sum=0;
		int  temp;
		temp=n;
		while(temp>0) {
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
		}
		if(n==sum) {
			System.out.println("the number is the palindrome number");
		}
		else {
			System.err.println("the number is not the palindrome number");
		}

	}

}
