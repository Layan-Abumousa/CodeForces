import java.util.*;
public class Layano {
       public static int min(int[]arr){
       
       int min =arr[0];
           for (int i = 0; i < arr.length; i++) {
               if (arr[i]<min) {
                   min=arr[i];
               }
           }
           return min;
       
       
       
       
       }
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int arr[]= new int [3];
      int n,k,l,c,d,p,nl,pl;
      n=in.nextInt();
      k=in.nextInt();
      l=in.nextInt();
      c=in.nextInt();
      d=in.nextInt();
      p=in.nextInt();
      nl=in.nextInt();
      pl=in.nextInt();
      arr[0]=(k*l)/nl;
      arr[1]= c*d;
      arr[2]=p/pl;
        System.out.println(min(arr)/n);
    }
}
