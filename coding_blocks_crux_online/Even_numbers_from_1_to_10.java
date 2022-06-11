package coding_blocks_crux_online;

import java.util.Scanner;

public class Even_numbers_from_1_to_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}
