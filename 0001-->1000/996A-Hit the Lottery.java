import java.util.*;
public class Layanooooooo {
 
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int c=0;
      int x=in.nextInt();
        if (x>=100) {
          c=x/100;
          x%=100;
        }
        
        if (x>=20) {
            c+=(x/20);
             x%=20;
        }
        
       
        if (x>=10) {
          c+=(x/10);
          x%=10;
        }
        
        if (x>=5) {
            c+=(x/5);
             x%=5;
        }
        if (x<5) {
             c+=x;
        }
           
        
        
        System.out.println(c);
        
        
        
    }
}
