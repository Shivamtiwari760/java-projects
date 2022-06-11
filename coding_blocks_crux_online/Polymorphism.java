package coding_blocks_crux_online;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism a1= new Polymorphism();
		a1.Area(10,10);
		a1.Area(10,10,10);
		a1.Area(10);

	}
 public void Area(int x, int y) {
	 int mul=x*y;
	 System.out.println(mul);
	 return;
}
 public void Area(int x,int y, int z) {
	 int A= x*y*z;
	 System.out.println(A);
	 return;
 }
 public void Area(int l){
	  int A = l*l;
	  System.out.println(A);
	  return;
	 
 }
}
