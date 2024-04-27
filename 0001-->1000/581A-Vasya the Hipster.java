import java.util.*;
public class Layano{
        public static int min(int a , int b){
            if (a>b) {
                return b;
                
            }
            else
                return a;
        
        }
        public static int max(int a , int b){
            if (a<b) {
                return b;
                
            }
            else
                return a;
        
        }
        

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      int y =in.nextInt();
      
        System.out.println(min(x,y)+" "+(max(x,y)-min(x,y))/2 );
      
      
    }
}
