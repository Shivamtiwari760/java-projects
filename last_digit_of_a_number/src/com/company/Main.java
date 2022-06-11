package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	 int n=0,last_digit;
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 last_digit=n%10;
        System.out.println(last_digit);
    }
}
