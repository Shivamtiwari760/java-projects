// we do not create objects to access static variables
public class E {
	static int x=10;
	public static void main(String[] args) {
		E e1 = new E();
		System.out.println(E.x);
		
	}

}
