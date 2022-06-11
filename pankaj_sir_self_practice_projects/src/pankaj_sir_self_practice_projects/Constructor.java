package pankaj_sir_self_practice_projects;

public class Constructor {
	   Constructor(int x){
		   System.out.println(x);
	   }
	   
	   Constructor(){
		   this(890);
		   
	   }
	   Constructor(int x, int y){
		   int sum=x+y;
		   System.out.println(sum);
	   }
	   Constructor(char c){
		   System.out.println(c);
		   
	   }

	public static void main(String[] args) {
		Constructor a1= new Constructor();
		Constructor a2= new Constructor(100);
		Constructor a3= new Constructor(12,14);
		Constructor a4 = new Constructor('n');
	}

}
