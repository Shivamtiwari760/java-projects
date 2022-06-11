package com.company;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        System.out.println("welcome to the course");
        Scanner sc=new Scanner(System.in);
        double max=100;
        float a=sc.nextInt();
        System.out.println(a);
        System.out.println("enter the physics marks obtained");
        float physics=sc.nextInt();
        System.out.println(" enter the chemistry marks obltainedin board");
        float chemistry=sc.nextInt();
        System.out.println(" enter the maths marks obtained in board");
        float maths=sc.nextInt();
        System.out.println("enter the marks obtained in physical education");
        float physicalEducation=sc.nextInt();
        System.out.println("enter the marks obtained in hindi");
        float hindi=sc.nextInt();
        System.out.println("enter the marks obtained in english");
         float english=sc.nextInt();
        float marks=physics+chemistry+physicalEducation+english+hindi+maths;
        System.out.println(marks);
        float total=(marks/600);
        System.out.println(total);
        float percent=((marks/600)*100);
        System.out.println(percent);
    }
}
