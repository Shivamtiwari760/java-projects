import java.util.Scanner;
import java.io.*;
public class echo {
    public static void main(String[] args) {
        int s=0;
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i< args.length;i++)
            s=s+Integer.parseInt(args[i]);
        System.out.println(args[i]);
    }
}
