package com.company;

import java.util.Scanner;

public class demo_program {
    public static void main(String[] args) {
        System.out.println("enter the 5 subject marks: ");
        Scanner sc= new Scanner(System.in);
        System.out.println("the maximum marks obtained from subject");
        System.out.println("enter the first subject marks");
        float s1= sc.nextFloat();
        System.out.println("enter the second subject marks");
        float s2= sc.nextFloat();
        System.out.println("enter the 3rd subject marks");
        float s3= sc.nextFloat();
        System.out.println("enter the 4th subject marks: ");
        float s4= sc.nextFloat();
        System.out.println("enter the 5th subject marks");
        float s5=sc.nextFloat();
        float total=s1+s2+s3+s4+s5;
        float percentage=(total/500)*100;
        System.out.println("the percentage of the student is");
        System.out.println(percentage);
    }
}
