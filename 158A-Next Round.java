
import java.util.*;

public class Layanooooo {
       public static boolean i(int arr[]){
          int f=0;
          int c=0;
              
              for (int i = 0; i < arr.length; i++) {
                  if (arr[i]==f) {
                      c++;
                  }
              }
              if (c==arr.length) {
                  return true;
              }
              else
                  return false;
          
          }


     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int x = in.nextInt();
         int p= in.nextInt();
         int arr[]= new int[x];
         int c=0;
         for (int i = 0; i < x; i++) {
             arr[i]=in.nextInt();
         }
         
         if (i(arr)) {
             System.out.println(0);
         }
         else{
         for (int i = 0; i < x; i++) {
             if (arr[i]>=arr[p-1] && arr[i]>0) {
                 c++;
             }
         }
                System.out.println(c);
         
         }
         
        }}
