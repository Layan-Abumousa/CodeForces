import java.util.*;

public class Layanooooo {
    public static int triple(int x){
        return x*3;
    }
    public static int doubl(int x){
        return x*2;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int y = in.nextInt();
        int c=0;
         if (x==y) {
             System.out.println(1);
        }
         else
         {
             
             for (int i = 1; i >0; i++) {
                 x=triple(x);
                 y=doubl(y);
                 c++;
                 if (x>y) {
                     System.out.println(c);break;
                 }
             }
         
         }
        
    }
}
