package coding_blocks_crux_online;

import java.util.Scanner;

public class Armstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int temp;
		int rem;
		int result=0;
		temp=num;
		while(temp!=0) {
			rem=temp%10;
			result=result+(rem*rem*rem);
			temp=temp/10;
			
		}
		if(num==result) {
			System.out.println("the number is the armstrong number");
		}
		else{
			System.out.println("the number is not armstrong number");
		}

	}

}
