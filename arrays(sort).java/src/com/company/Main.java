package com.company;
 import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
	// write // Our arr contains 8 elements
                int[] arr1 = {5, 20, 12, 30};
                char[] arr2 = {'B', 'B', 'A', 'C', 'A'};
        //        // Sorting the first array
                Arrays.sort(arr1);
        //        // Displaying the first array
                System.out.println(Arrays.toString(arr1));

              // Sorting the second array
                Arrays.sort(arr2);
        //        // Displaying the second array
               System.out.println(Arrays.toString(arr2));
    }
}
