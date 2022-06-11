package com.company;
   import java.util.Scanner;
    class exercise_01
    {
        public static void main(String[] args) {
            float m1, m2, m3, m4, m5, total_marks;
            float percentage;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the marks in subject 1: ");
            m1 = sc.nextInt();
            System.out.print("Enter the marks in subject 2: ");
            m2 = sc.nextInt();
            System.out.print("Enter the marks in subject 3: ");
            m3 = sc.nextInt();
            System.out.print("Enter the marks in subject 4: ");
            m4 = sc.nextInt();
            System.out.print("Enter the marks in subject 5: ");
            m5 = sc.nextInt();
            total_marks = (m1+m2+m3+m4+m5);
            percentage = (total_marks/500)*100;
            System.out.println("The percentage obtained by the student is: "+percentage);
        }
    }