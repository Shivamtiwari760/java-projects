package new_One;

import java.util.Scanner;
import java.util.Set;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
public class duplicate {
	public static void main(String[] args) { 
		HashSet<String> uniquename= new HashSet<String>();
		ArrayList<String> list = new ArrayList<String>();
		
		File file = new File("weather-in_bangalore");
		Scanner input = new Scanner(file);
		String prev = input.next();
		int count = 0;
		while (input.hasNext()) {
			String next = input.next();
			System.out.println(next);
		    Set.add(next);
			count = count + 1;
			prev = next;
		}
		System.out.println(list);
	}
}
