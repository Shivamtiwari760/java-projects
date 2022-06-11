//write a program to calculate the cgpa using marks of 3 subjects out of 100
package com.company;
import java.util.Scanner;
public class practiceset_o7 {
    public static void main(String[] args) {
        System.out.println("enter the student 3 subject marks");
        Scanner sc=new Scanner(System.in);
        System.out.println("first subject marks");
        float s1=sc.nextFloat();
        System.out.println("second subject marks");
        float s2=sc.nextFloat();
        System.out.println("third subject marks");
        float s3=sc.nextFloat();
        System.out.println("the sum of the 3 subject marks of a student is");
        float sum=s1+s2+s3;
        System.out.println(sum);
        float cgpa=sum/30;
        System.out.println("the cgpa of the student is");
        System.out.println(cgpa);
    }
}
