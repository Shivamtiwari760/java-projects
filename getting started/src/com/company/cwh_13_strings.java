package com.company;
import java.util.Scanner;
public class cwh_13_strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(str);
        String name=new String("harry bro ek number ho aap");
        System.out.println(name);
        String name1=new String("shivam");
        System.out.println(name1);
        String name2="halwa";
        System.out.println(name2);
        String name3="priyanka";
        System.out.print("the name is:");// print ka use isiliiye hota h taki uske baad space na mile
        System.out.println(name3);
        int a=6;
        float f=6.768f;
        System.out.printf("the value of a is %d and the value of f is %f:",a,f);
        System.out.format("the value of a is %d and the value of f is %f:",a,f);
    }
}
// println ka kaam h jb aap yh likhoge tab woh print kregaor uske aage ek space chod dega
// %d ko bolte h format specifier, hum %d use krte h intger ke liye hum %f use krte h float ke liye, %c use krte h character ke liye or %s use krte h strings ke liye
// printf and format dono ek hi kaam krte h