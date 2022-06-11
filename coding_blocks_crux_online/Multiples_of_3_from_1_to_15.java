package coding_blocks_crux_online;

import java.util.Scanner;

public class Multiples_of_3_from_1_to_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%3==0) {
				System.out.println(i);
			}
		}
		

	}

}
