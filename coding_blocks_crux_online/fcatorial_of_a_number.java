package coding_blocks_crux_online;

import java.util.Scanner;

public class fcatorial_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		;
		for(int i=1;i<=n;i++) {
				fact= fact*i;
				
			}
		System.out.println(fact);
		}
		

	}


