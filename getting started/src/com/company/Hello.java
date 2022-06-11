package com.company;
// main method
public class Hello{
    public static void main(String[] args) {
        System.out.println("getting started with java");
        int num=5;
        float floatNum=5.99f;
        char letter ='D';
        boolean bool =true;
        String site="shnat world.com";
        System.out.println(num);
        System.out.println(floatNum);
        System.out.println(letter);
        System.out.println(bool);
        System.out.println(site);
        String word = "QuickRef";
        for (char c: word.toCharArray())
            System.out.println(c + "-");
        String first="shivam";
        String last="tiwari";
        String Name=first+" "+last;
        System.out.println(Name);
        int num1=5;
        int num2=6;
        int num3=7;
        int sum=num1+num2+num3;
        System.out.println(sum);

    }

}