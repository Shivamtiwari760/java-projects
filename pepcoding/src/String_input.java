import java.util.*;
import java.io.*;
import java.util.Scanner;
public class String_input {
    public static void main(String[] args) {
        System.out.println("welcome to the pepcoding series");
        Scanner scn= new Scanner(System.in);
        String str=scn.nextLine();
        System.out.println(str);
        String str1= scn.next();// yh bsphle space tak ka hi output dega
        System.out.println(str1);
        str1=scn.next();
        System.out.println(str1);
        String str2=scn.nextLine();
        System.out.println(str2);
    }
}
