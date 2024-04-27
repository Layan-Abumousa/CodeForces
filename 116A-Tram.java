import java.util.*;

public class Layanooooo {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int arr[]=new int[x];
        int brr[]=new int[x];
        int sum=0;
        
        int fi[]=new int [x];
        for (int i = 0; i < x; i++) {
            arr[i]=in.nextInt();
            brr[i]=in.nextInt();
        }
        for (int i = 0; i < x; i++) {
            sum=sum+(-arr[i])+brr[i];
          fi[i]=sum;
        }
        int max=fi[0];
        for (int i = 0; i < x; i++) {
            if (fi[i]>max) {
                max=fi[i];
            }
        }
        
        System.out.println(max);
        
    }}
