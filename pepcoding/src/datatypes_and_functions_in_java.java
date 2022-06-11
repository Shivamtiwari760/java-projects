public class datatypes_and_functions_in_java {
    public static  void fun()
    {
        int temp=a;
        a=b;
        b=temp;
    }
    static int a=10;
    static int b=20;
    public static void main(String[] args) {
        System.out.println("here we have initiated the concept of data types and function");
        fun();
        System.out.println(a+" "+b);
    }
}
