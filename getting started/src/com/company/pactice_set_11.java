package com.company;
import java.util.Scanner;
public class pactice_set_11 {
    public static void main(String[] args) {
        System.out.println("enter the student marks to calculate his percentage");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first subject  marks");
        int s1=sc.nextInt();
        System.out.println("enter the second subject marks");
        int s2=sc.nextInt();
        System.out.println("enter the third subject marks");
        int s3=sc.nextInt();
        System.out.println("ether the fourth subject marks");
        int s4=sc.nextInt();
        System.out.println("enter the fourh subject marks");
        int s5=sc.nextInt();
        int total=s1+s2+s3+s4+s5;
        System.out.println(total);
        float percentage=(total/500f)*100;
        System.out.println(percentage);
    }
}
/*package com.company;
import java.util.Scanner;

public class cwh_11_ex1_sol {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Physics marks : ");
        int physics = scan.nextInt();
        System.out.println("Enter your English marks : ");
        int English = scan.nextInt();
        System.out.println("Enter your Chemistry marks : ");
        int chemistry = scan.nextInt();
        System.out.println("Enter your Mathematics marks : ");
        int mathematics = scan.nextInt();
        System.out.println("Enter your Computer Science marks : ");
        int computer = scan.nextInt();

        float percentage = ((physics + English + chemistry + mathematics + computer)/500.0f)*100;

        System.out.println("percentage : ");
        System.out.println(percentage);


    }
}*/