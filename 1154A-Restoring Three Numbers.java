
import java.util.*;
public class Layanoo {
       
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int arr[]= new int [4];
      
      int max = arr[0];
        for (int i = 0; i < 4; i++) {
            arr[i]=in.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            if (arr[i]>max) {
                max = arr[i];
                
            }
        }
        for (int i = 0; i < 4; i++) 
        {
            if(max-arr[i] !=0 )
                System.out.println((max-arr[i])+" ");
            
        }
      
      
      
      
      
    }
}
