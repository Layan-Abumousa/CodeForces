import java.util.*;
public class Layano {
   
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        int p = in.nextInt();
         int c=0;
        for (int i = 0; i < p; i++) {
            
            int a= in.nextInt();
            int b= in.nextInt();
            if (a%b==0) {
                System.out.println(0);
            }
            else
                System.out.println(b-(a%b));
        }
      
    }
}
