import java.util.*;

public class Layanooooo {
 
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y =in.nextInt();
        int z =in.nextInt();
        int sum=0;
                
        for (int i = 1; i <=z; i++) {
            sum+=(x*i);
        }
        if (sum>=y) {
            System.out.println(sum-y);
        }
        else
            System.out.println(0);
        
    }
}
