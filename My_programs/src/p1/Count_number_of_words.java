package p1;

public class Count_number_of_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= " pankaj sir academy ";
		String [] s= str.trim().split(" ");
		System.out.println(str.length());
		for(String x:s) {
			System.out.println(x);
		}

	}

}
