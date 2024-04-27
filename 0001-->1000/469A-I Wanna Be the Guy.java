
import java.util.*;
public class Layano {
  
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int x =in.nextInt();
        int c=0;
        int arr[]= new int [x];
        for (int i = 0; i < x; i++) {
            arr[i]=in.nextInt();
            
        }
        int y =in.nextInt();
        int brr[]= new int [y];
        for (int i = 0; i < y; i++) {
            brr[i]=in.nextInt();
            
        }
        int e[]=new int[p];
       for (int i = 0; i <arr.length;i++) {
            e[arr[i]-1]++;
            
        }
      
        for (int i = 0; i <brr.length;i++) {
            e[brr[i]-1]++;
            
        }
        for (int i = 0; i < p; i++) {
            if (e[i]==0) {
                c++;
            }
        }
        if (c>0) {
            System.out.println("Oh, my keyboard!");
        }
        else
            System.out.println("I become the guy.");
      
    }
}
