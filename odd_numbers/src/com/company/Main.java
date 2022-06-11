package com.company;

public class Main {

    public static void main(String[] args) {
        int n=10;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.println(i);
                System.out.println("even numbers");
            }
            else if(i%2!=0){
                System.out.println(i);
                System.out.println("odd numbers");
            }
            else{
                System.out.println("invalid");
            }
        }
    }
}
