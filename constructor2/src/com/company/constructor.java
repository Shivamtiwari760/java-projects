package com.company;

public class constructor {
    constructor()
    {
        System.out.println(100);
    }
    constructor(int x)
    {
        System.out.println(x);
    }
    constructor(int y, int z)
    {
        System.out.println(y);
        System.out.println(z);

    }

    public static void main(String[] args) {
        constructor a1=new constructor();
        constructor a2=new constructor(200);
        constructor a3=new constructor(500,700);
    }
}
