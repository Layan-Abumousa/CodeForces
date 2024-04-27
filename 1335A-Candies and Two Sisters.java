import java.util.*;
public class Layanoooo {
 
   
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int arr[] = new int [x];
        for (int i = 0; i < x; i++) {
            arr[i]=in.nextInt();
        }
        for (int i = 0; i < x; i++) {
            if (arr[i]<=2) {
                System.out.println(0);
               
            }
            else {
                if (arr[i]%2==0) {
                    System.out.println((arr[i]/2)-1);
                }
                else
                    System.out.println(arr[i]/2);
            
            }
        }
        
        
    }
}
