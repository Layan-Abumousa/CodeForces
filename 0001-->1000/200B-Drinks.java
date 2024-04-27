import java.util.*;

public class Layano {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x =in.nextInt();float sum=0;
        int arr[]= new int[x];
        for (int i = 0; i < x; i++) {
            arr[i]= (in.nextInt());
            
        }
        for (int i = 0; i < x; i++) {
           sum+=arr[i];
        }
        sum/=100;
        sum/=x;
        System.out.println(sum*100);
        
    }
}
