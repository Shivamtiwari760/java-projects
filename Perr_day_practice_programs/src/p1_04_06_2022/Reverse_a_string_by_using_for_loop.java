package p1_04_06_2022;

public class Reverse_a_string_by_using_for_loop {

	public static void main(String[] args) {
		String str="Shivam Tiwari";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
