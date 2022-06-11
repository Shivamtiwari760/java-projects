package PackOne;

import java.util.Scanner;

public class Percent {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your physics marks ");
		float  physics=sc.nextInt();
		System.out.println("enter your maths marks ");
		float  maths=sc.nextInt();
		System.out.println("enter your chemistry marks ");
		float  chemistry=sc.nextInt();
		float total=chemistry+maths+physics;
		float percent=(total/300)*100;
		System.out.println("your percent is " +percent);
		if(percent>70) {
			System.out.println("first division");
		}
		else if(percent>60 && percent<70) {
			System.out.println("second division");
		}
		else if(percent >50 && percent <60) {
			System.out.println("third division");
		}
		else {
			System.out.println("fail");
		}
		
		
		
	}

}
