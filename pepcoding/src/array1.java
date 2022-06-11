public class array1 {
    public static  void fun(int arr[])
    {
       arr[2]=60;
       arr[4]=90;
       for(int i=0;i<arr.length;i++)
           System.out.println(arr[i]);
    }
    public static void main(String[] args) {
        System.out.println("welcome to the arrray questions series");
        int arr[]=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        fun(arr);
        for(int val:arr){
            System.out.println(val);
        }
    }
}
