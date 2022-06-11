//non static member

public class C {
	 int x=10;
	public static void main(String[] args) {
		System.out.println(C.x);// error because object is not getting created

	}

}

// correcct program after creating an object
public class C{
	int x=20;
	public static void main(String[] args) {
		C c1= new C();
		System.out.println(c1.x);
		
	}
}
