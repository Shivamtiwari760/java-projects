package p1_04_06_2022;

public class Reverse_a_string_by_using_String_builder {
	public static void main(String[] args) {
		String str="shivam Tiwari";
		StringBuilder sb= new StringBuilder("Shivam tiwari");
		System.out.println("original String is: " + sb);
		System.out.print("reverof String is : "+ sb.reverse());
	}

}
