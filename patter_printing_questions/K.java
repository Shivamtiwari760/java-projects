package patter_printing_questions;

public class K {
	public static void main(String[] args) {
		int arr[]= {5,12,19,25,36};
		int count1=0;
		int count2=1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i+1];
			count1++;
			count2++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}
	

	}


