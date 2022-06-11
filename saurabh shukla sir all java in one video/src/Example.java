public class Example {
    int x;// instance variable
    static int y;// static member variable
    public void fun1(){}// instance member function
    public static void fun2(){}// static member functions
    static class test
    {
        public static void main(String[] args) {
            Example ex1=new Example();
            Example ex2=new Example();
            Example.y=7;
            Example.fun2();
        }
    }

}
