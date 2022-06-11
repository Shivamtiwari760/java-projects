//write a java program which asks the user to enter is name and greets with them  hello <name> have good day text
package com.company;
import java.util.Scanner;
public class asking_input_from_the_user_pactice_set_07 {
    public static void main(String[] args) {
        System.out.println("what is your name");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        System.out.println("hello " +name+ " have a great day ahead");
    }
}
;