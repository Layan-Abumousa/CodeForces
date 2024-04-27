import java.util.*;
public  class Layanoo{
  
    public static boolean sign(int x){
        return(x>0);}
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
       int n = in.nextInt(); 
      
        for (int i = 0; i < n; i++) {
            int a=in.nextInt();
            int b=in.nextInt();
            int c=in.nextInt();
            if (c>Math.max(a, b)) {
                System.out.println("+");
            }
            else
                System.out.println("-");
            
            
            
            
        }
    
    
    
    
        }
    }
