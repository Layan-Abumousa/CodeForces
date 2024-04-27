import java.util.*;
public class Layanooo {
       
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int p = in.nextInt();
      int c=0;
        for (int i = 0; i < p; i++) {
            c=0;
            int a = in.nextInt();
           
            int y =in.nextInt();
            int x = Math.abs(a-y);
           if (x>=10) {
          c=x/10;
          x%=10;
        }
        
        if (x>=9) {
            c+=(x/9);
             x%=9;
        }
        
       
        if (x>=8) {
          c+=(x/8);
          x%=8;
        }
        
        if (x>=7) {
            c+=(x/7);
             x%=7;
        }
          if (x>=6) {
            c+=(x/6);
             x%=6;
        }
        
       
        if (x>=5) {
          c+=(x/5);
          x%=5;
        }
        
        if (x>=4) {
            c+=(x/4);
             x%=4;
        }
          if (x>=3) {
            c+=(x/3);
             x%=3;
        }
        
       
        if (x>=2) {
          c+=(x/2);
          x%=2;
        }
        if (x<2) {
             c+=x;
        }
            System.out.println(c);
        }
      
      
    }
}
