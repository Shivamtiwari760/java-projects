package com.company;
import java.io.*;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=0;
        char n1='a';
        String ch="x";
        while(true)
        {
            n=sc.nextInt();
            sum=sum+n;
            System.out.println(sum);
        }
    }
}
