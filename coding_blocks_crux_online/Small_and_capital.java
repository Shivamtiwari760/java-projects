package coding_blocks_crux_online;

import java.util.Scanner;

public class Small_and_capital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	    String str=sc.next();
	    System.out.println("enter the name");
	    System.out.println(str.length());
	    int small=0;
	    int capital=0;
	    int l= str.length();
	    for(int i=0;i<=l-1;i++) {
	    	if(str.charAt(i)>='a' && str.charAt(i)<='z') {
	    		small++;
	    	}
	    	else {
	    		capital++;
	    	}
	    }
	    if(str.length()==small) {
	    	System.out.println("all are small only");
	    }
	    else if(str.length()==capital) {
	    	System.out.println("all are capital");
	    }
	    else {
	    	System.out.println("all are mixed up");
	    }
	    

	}

}
