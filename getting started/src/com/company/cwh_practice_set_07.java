// you have to find sum of three numbers
package com.company;
import java.util.Scanner;

public class cwh_practice_set_07 {
    public static void main(String[] args) {
        System.out.println("enter the 3 numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1");
        int s1=sc.nextInt();
        System.out.println("enter the second number");
        int s2=sc.nextInt();
        System.out.println("enter the 3rd number");
        int s3= sc.nextInt();
        System.out.println("the sum of three number is");
        int sum=s1+s2+s3;
        System.out.println(sum);

    }
}
