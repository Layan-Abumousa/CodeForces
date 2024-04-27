import java.util.Random;
import java.util.Scanner;

public class C {
    
    
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int x= in.nextInt();
        int y = in.nextInt();
        int h = 240;
        h-=y;
        
        int c=0;
       
        for (int i = 1; i <= x; i++) {
            if (y>=0) {
          h-=(5*i);
                if (h>=0) {
                    c++;
                }
          
            }
            else
                break;
            
        }
        
        System.out.println(c);
    }
}
