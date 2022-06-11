package patter_printing_questions;

import java.util.Scanner;

public class Pattern_20 {

	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      int n=sc.nextInt();
      int nr =2*n-1;
      int row=1;
      int nst=1;
      while(row<=nr) {
    	  int cst=1;
    	  while(cst<=nst) {
    		  System.out.print('*');
    		  cst++;
    	  }
    	  System.out.println();
    	  if(row<=nr/2) {
    		  nst++;
    	  }
    	  else
    	  {
    		  nst--;
    	  }
    	  row++;
      }
	}

}
