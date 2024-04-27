import java.util.*;

public class Layanooooo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int arr[]= new int[x];
        for (int i = 0; i < x; i++) {
            arr[i]=in.nextInt();
            
        }
        int c=0;
        
        for (int i = 0; i < x; i++) {
            if (arr[i]==1) {
                c++;
            }
        }
        if (c>0) {
            System.out.println("HARD");
        }
        else
            System.out.println("EASY");
        
        
        
    }
}
