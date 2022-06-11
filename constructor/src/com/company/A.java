package com.company;

public class A {
    A(){
        System.out.println(600);
        return ;
    }

    public static void main(String[] args) {
	 A a1=new A();
	 A a2=new A();
	 A a3=new A();
	 A a4=new A();
    }
}
// constructor is always permanently void hence it cannot  return any value;
