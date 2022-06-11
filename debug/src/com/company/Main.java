package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int p = scn.nextInt();
        int count = 0;
        int n = 0;
        while (count < p)
        {
            int ele = 5 * n + 2;
            if (ele % 4 ==0)
            {
                n++;
                continue;
            } else
            {
                count++;
                n++;
                System.out.println(ele);
            }
        }
    }
}


