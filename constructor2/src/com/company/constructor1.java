package com.company;
import java.util.*;
import java.util.Scanner;
public class constructor1 {
    constructor1(int x)
    {
        System.out.println(x);
    }
    constructor1(char c)
    {
        System.out.println(c);
    }
    constructor1(boolean b)
    {
        System.out.println(b);
    }
    constructor1(String name1= "Tiwari")
    {
        System.out.println(name1);
    }

    public static void main(String[] args) {
        constructor1 a1=new constructor1(x);
        constructor1 a2=new constructor1(c);
        constructor1 a3=new constructor1(b);
        constructor1 a4=new constructor1(name1);
    }
}
