package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	 int a,b;
	 Scanner sc=new Scanner(System.in);
	 a=sc.nextInt();
	 b=sc.nextInt();
	 if(a>b)
         System.out.println(a);
	 else if(a==b)
         System.out.println("both numbers are equal");
	 else
         System.out.println(b);
    }
}
