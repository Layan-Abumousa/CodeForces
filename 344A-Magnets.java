
import java.util.*;

public class Layano {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x= in.nextInt();
        int arr[]= new int [x];
        int c=0;
        for (int i = 0; i < x; i++) {
            arr[i]=in.nextInt();
        }
        
        for (int i = 0; i < x-1; i++) {
            if (arr[i]!=arr[i+1]) {
                c++;
            }
        }
        System.out.println(c+1);
      
        
        
    }
}
