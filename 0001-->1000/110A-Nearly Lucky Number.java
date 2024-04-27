
import java.util.*;

public class Layano {
   
    public static boolean islucky(long x){
        if (x==4 ||x==7) {
            return true;
        }
        else
            return false;
    
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
      
        
        int d=0;
        while(x>0){
           long r = x%10;
            if (islucky(r)) {
                d++;
            }
            x/=10;
            
        }
        
        if (islucky(d)) {
            System.out.println("YES");
        }
        
        else System.out.println("NO");
        
        
        
    }
}
