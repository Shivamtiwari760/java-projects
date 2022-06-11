package com.company;
import java.util.Scanner;
// write a java program to convert kilometres to miles
public class practice_set07 {
    public static void main(String[] args) {
        System.out.println("enter the value of kilometres");
        Scanner Sc=new Scanner(System.in);
        float km=Sc.nextFloat();
        double miles=km/0.624;
        System.out.println(miles);
    }
}
