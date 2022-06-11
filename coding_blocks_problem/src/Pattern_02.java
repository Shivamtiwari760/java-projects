import java.util.*;
import java.io.*;
public class Pattern_02 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int row=1;
        while(row<=n){
            int nst =1;
            while(nst<=row){
                System.out.print('*');
                nst++;
            }
            System.out.println();
            row++;

        }
    }
}
