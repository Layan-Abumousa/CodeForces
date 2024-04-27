import java.util.Random;
import java.util.Scanner;

public class C {
    
    
    public static  int  nd (int x ){
    int c = 0;
    int y = x;
    while(x!=0){
        int r = x%10;
        if ((r)!=0) {
            c++;
        }
        
        x/=10;
    }
    
    x=y;
    return c;
    
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int n = in.nextInt();
        int c = 0;
      
        for (int i = 0; i < n; i++) {
            c=0;
            int x = in.nextInt();
            System.out.println(nd(x));
            while(x!=0){
            int d = x%10;
                if (d!=0) {
                    System.out.print((int)(d*Math.pow(10, c))+" ");
                }
                c++;
                x/=10;
                
            }
                   
            System.out.println("");
          
            
        }
        
    }
}
