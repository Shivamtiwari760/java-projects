package code_decode;

public class Marks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("so you want to calculate the marks");
		Marks m=new Marks();
		m.GetMarks();
		
	}
	public void GetMarks() {
		int maths=90;
		int physics=76;
		int chemistry=79;
		int total=(maths+physics+chemistry);
		total=total/3;
		System.out.println(total);
	}

}
