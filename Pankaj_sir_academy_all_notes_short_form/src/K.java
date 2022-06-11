// program for the armstrong number
public class K {

	public static void main(String[] args) {
		int result=0,temp, rem;
		int num=153;
		temp=num;
		while(temp!=0) {
			rem=temp%10;
			result=result+(rem*rem*rem);
			temp=temp/10;
		}
		if(num==result) {
			System.out.println("it is an armstrong number");
		}
		else {
			System.out.println("it is not a armstrong number");
		}
      
	}

}
