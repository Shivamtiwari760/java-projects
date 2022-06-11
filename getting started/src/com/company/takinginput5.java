package com.company;
import java.util.Scanner; /* importimg the external coder to be here* for using the scanner class*/

public class takinginput5{
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc= new Scanner(System.in);/* system.in means we want to take the input from the keyboard*/
        System.out.println("enter number 1");
        boolean b1=sc.hasNextInt();
        System.out.println(b1);
       // int a=sc.NextInt();
        float a=sc.nextFloat();
        System.out.println("enter number 2");
      //  int b=sc.nextInt();
        float b=sc.nextFloat();
        // int sum=a+b;
        Float sum=a+b;
        System.out.println("the sum of these number is");
        System.out.println(sum);
        String str=sc.next();
        System.out.println(str);
        String str1=sc.next();
        System.out.println(str1);

    }

}
