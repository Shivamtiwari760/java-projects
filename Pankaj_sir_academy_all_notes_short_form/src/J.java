// palindrome of a number
public class J {

	public static void main(String[] args) {
      int sum=0,rem, temp;
      int num=771;
      temp=num;
      while(num>0) {
    	  rem=num%10;
    	  sum=(sum*10)+rem;
    	  num= num/10;
      }
      if(temp== sum) {
    	  System.out.println("it is palindrome");
      }
      else {
    	  System.out.println("it is not palindrome");
      }
      
	}

}
