package com.company;
import java.util.Locale;
import java.util.Scanner;
public class CWh_14_string_methods {
    public static void main(String[] args) {
        String name="Shivam";
        //String str=new String("tiwari");
        System.out.println(name);
        //System.out.println(str);
        int value=name.length();// to print the length of the string we use the .length method
        System.out.println(value);
        String value1=name.toLowerCase();
        System.out.println(value1);
        String value2=name.toUpperCase();
        System.out.println(value2);
    }
}
