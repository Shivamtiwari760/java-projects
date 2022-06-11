package coding_blocks_crux_online;

import java.util.Scanner;

public class IfElseIf_demo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age of the person");
		int age=sc.nextInt();
		if(age<11) {
			System.out.println("the person is the child");
		}
		else if(age>=12 && age<18) {
			System.out.println("the person is teenager");
		}
		else if(age>=18 && age<=60) {
			System.out.println("the person is adult");
		}
		else{
			System.out.println("the person is old");
			}
		}


}