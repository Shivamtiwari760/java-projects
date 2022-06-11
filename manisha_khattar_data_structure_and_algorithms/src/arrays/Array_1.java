package arrays;

import java.util.Scanner;

public class Array_1 {
	public static void main(String[] args) {
		int arr[]= new int[5];
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		int input[]= new int[size];
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.println(input[i]+" ");
		}
	}

}
