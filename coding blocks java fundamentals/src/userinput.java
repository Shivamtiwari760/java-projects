
import java.io.*;
import java.util.Scanner;
public class userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        System.out.println("enter the 3rd number");
        int c=sc.nextInt();
        if(a>b&&a>c)
        {
            System.out.println(a);
        }
        else if(b>a&&b>c)
        {
            System.out.println(b);
        }
        else
            System.out.println(c);
    }
}
