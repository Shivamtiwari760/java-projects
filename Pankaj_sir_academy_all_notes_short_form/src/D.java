// always the copy of non static variables getting created
public class D {
	int x=100;
	public static void main(String[] args) {
		D d1=  new D();
		d1.x=1000;
		System.out.println(d1.x);
		
		D d2 = new D();
		System.out.println(d2.x);
		
	}

}
