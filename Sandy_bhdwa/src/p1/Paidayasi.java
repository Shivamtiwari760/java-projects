package p1;

import java.util.Scanner;

public class Paidayasi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the dob dd//mm//yy");
		int[] dob=new int[3];
		for(int i=0;i<dob.length;i++) {
			
			dob[i]=sc.nextInt();
		}
			
		if(dob[1]>=1 && dob[1]<=4) {
			
				System.out.println("summer");
			}
		else if(dob[1]>=5 && dob[1]<=8) {
			
			System.out.println("spring");
		}
		
			
			
		
		else {
			System.out.println("winter");
		}
		
		}
		}
			
//		for( int month =1; month<=4;month++) {
//			System.out.println("winter h kya  mere dost");
//		}
//		for(int month)
		
		
		
		
		
	
	
