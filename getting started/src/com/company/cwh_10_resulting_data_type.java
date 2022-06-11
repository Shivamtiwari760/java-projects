package com.company;
import java.util.Scanner;
public class cwh_10_resulting_data_type {
    public static void main(String[] args) {
         Float a=7.65f+665;
        System.out.println(a);
        byte x=5;
        int y=6;
        short z=8;
        float n=y+z;
        System.out.println(n);
        //increment and decrement operators
        int i=78;
        System.out.println(i++);// phle print hui fir increment hui, phle i ko print kro fir increment kro, phle
        // phle i ko use kro fir increment kr yh bhi kh skte h
        System.out.println(i);// yh h increment hui wali value
        System.out.println(++i);// phle increment hoga uske baad use hoga
        System.out.println(i);
        int h=7;
        System.out.println(++h*8);
        char ch='a';
        System.out.println(++ch);

    }
}
