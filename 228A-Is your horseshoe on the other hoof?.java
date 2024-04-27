import java.util.*;
public class Layano {
    public static boolean check(int arr[] , int x ){
       int c=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                c++;
                
            }
           
        }
        if (c>1) {
            return true;
        }
    else
            return false;
    }
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int arr1[]= new int [4];
        int arr[]=new int [4];
        for (int i = 0; i < 4; i++) {
            arr[i]=in.nextInt();
            
        }
        
        int c=0;
        for (int i = 0; i < 3; i++) {
            
            for (int j = i+1; j < 4; j++) {
                if (arr[i]==arr[j]) {
                    arr1[i]++;
                    c++;
                }
               
            }
        }
        
        
        
        int sum =0;
        for (int i = 0; i < 4; i++) {
            sum+=arr1[i];
        }
        if (sum==6) {
            System.out.println(3);
        }
        else if(c==3){
            System.out.println(2);}
        else
        System.out.println(sum);
    }
}
