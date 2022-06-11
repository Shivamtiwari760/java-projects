package coding_blocks_crux_online;

import java.util.Scanner;

public class Reverse_the_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		long n= sc.nextLong();
		long rem;
		long ans=0;
		while(n!=0) {
			rem=n%10;
			ans=ans*10+rem;
			n=n/10;
			
		}
		System.out.println(ans);

	}

}
