public class Remove {  
    public static void main(String[] args) {  
              String str = "Programming";  
              System.out.println(charRemoveAt(str, 1));  
           }  
           public static String charRemoveAt(String str, int p) {  
              return str.substring(0, p) + str.substring(p + 1);  
           }  
}  