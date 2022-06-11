import java.util.Scanner;
public class Class_12 {
    public static void main(String[] args) {
        System.out.println("board mein kitne percent bne\n");
        System.out.println("physics mein kitne the");
        Scanner sc=new Scanner(System.in);
        float physics=sc.nextFloat();
        System.out.println("chemistry mein kitne mile");
        float chemistry=sc.nextFloat();
        System.out.println("maths toh kamjor rhi hogi na");
        float  mathematics = sc.nextFloat();
        float total= (physics+chemistry+mathematics)/300;
        float percentage=total*100;
        System.out.println("itna pratishat bna aapka "+percentage);
    }
}
