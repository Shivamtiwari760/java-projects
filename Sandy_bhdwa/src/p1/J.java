package p1;

public class J {
	public static void main(String[] args) {
		J j1= new J();
		j1.area(2, 5);
		j1.area(3, 7, 8);
		j1.area(2, 90, 89, 87);
		
			
		
	
	
		
	}
	public void area( int l, int b) {
		System.out.println(l*b);
		
	}
	
		
	
	public void area(int l, int b, int h) {
		System.out.println(l*b*h);
		
	}
	public void area(int a,int b, int c, int d) {
		System.out.println(a+b+c+d);
		
	}
	

}
