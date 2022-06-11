package com.company;
import java.util.Scanner;
import java.io.*;
public class A {
    A(int x,int y,String z)
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    public static void main(String[] args) {
        A a1=new A(10,20,"shivam");

    }
}
// construtor overloading means here we can create more than constructor in the same class
//  the constructor should have diffrent number of arguments