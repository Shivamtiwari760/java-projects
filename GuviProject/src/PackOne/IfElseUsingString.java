package PackOne;

import java.util.Scanner;

public class IfElseUsingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String country=sc.next();
		if(country.equals("india"))
		{
			System.out.println("yes you can vote");
		}
		else if(country!="india")
		{
			System.out.println("you are not citizen so you cant vote");
		}

	}

}
