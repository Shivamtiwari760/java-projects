package com.company;

import java.util.Scanner;
// taken the input of the array and printing out the array elements
public class Arrray_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int input[]= new int[size];
        for(int i=0;i<size;i++){
            input[i]= sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(input[i]+" ");
        }
    }
}
