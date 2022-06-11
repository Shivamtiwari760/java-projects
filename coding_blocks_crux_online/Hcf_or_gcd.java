package coding_blocks_crux_online;
import java.util.Scanner;

public class Hcf_or_gcd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int divident=sc.nextInt();
		int divisor=sc.nextInt();
		while(divident%divisor!=0) {
			int rem;
			rem=divident%divisor;
			divident=divisor;
			divisor=rem;
		}
		System.out.println(divisor);
		
        	}

}
