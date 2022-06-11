package coding_blocks_crux_online;

import java.util.Scanner;

public class Number_of_words_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// here we are using the trim() method to remove the spaces from the begining and satrting of the string
		// here we are using split to split the words
		// by using the length we are finding out the length of the string
		Scanner sc= new Scanner(System.in);
		String str= "  Shivam tiwari is gonna get decent package  ";
		String s[]=str.trim().split(" ");
		System.out.println(s.length);
		for(String x:s) {
			System.out.println(x);
		}
		

	}

}
