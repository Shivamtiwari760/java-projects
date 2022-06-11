// program for finding out whether the program is prime or not
public class L {
	public static void main(String[] args) {
		boolean flag= false;
		int num=12;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag =true;
				return ;
			}
			else {
				flag = false
			}
		}
		if(!flag) {
			System.out.println("program is prime number");
		}
		else {
			System.out.println("the given number is not a prime number");
		}
	}

}

