// for non static members we are doing this
public class G {

	int x=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G g1= new G();
		g1.test();

	}
	public void test() {
		System.out.println(100);
	}

}
