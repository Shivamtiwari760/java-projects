
public class Box {
	private int length, breadth, height;
	public void setdimension(int l, int b, int h) {
		length=l; b=breadth;h=height;
	}
	public void showdimension() {
		System.out.println("l="+ 10);
		System.out.println("b="+ 20);
		System.out.println("h"+ 20);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box smallbox= new Box();
		smallbox.setdimension(10, 20, 30);
		smallbox.showdimension();
		

	}

}
