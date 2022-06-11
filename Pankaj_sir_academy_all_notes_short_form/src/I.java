// accessing the local variable in the particular class
public class I {

	public static void main(String[] args) {
		int id=10;
		System.out.println(id);
		I i1= new I();
		i1.test();

	}
	
	public void test() {
		System.out.println(id);// error cannot use local variable without static
	}

}
