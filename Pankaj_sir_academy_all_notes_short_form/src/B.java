// static and non static example
public class B {
	int x=10;
	static int y=20;

	public static void main(String[] args) {
		B b1= new B();
		System.out.println(b1.x);
		System.out.println(B.y);
       
	}

}
