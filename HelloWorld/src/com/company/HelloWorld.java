package com.company;
/*name of the file(HelloWorld.java) should be matching with the class*/
public class HelloWorld {
    /** write the methods
     *
     * which has the return type
     */
    int add(int a,int b){
        return a+b;
    }

    /**
     * method with no argument
     * @param args
     */
    int return5()
    {
        return 5;
    }

    /**
     * method with no return type
     * @param args
     */
    void noReturn(){
        System.out.println("hello java");
    }
    public static void main(String[] args){
        System.out.println("hello baba");
    }
}
