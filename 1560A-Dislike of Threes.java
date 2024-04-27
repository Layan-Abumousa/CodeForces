import java.util.*;
public  class Layanoo{
  
   
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
       int n = in.nextInt(); 
      
        for (int i = 0; i < n; i++) {
           int x = in.nextInt();
           int c=0;
           int j=1;
            for ( j = 1; j <=2000 ; j++) {
                if (j%3!=0 && j%10!=3) {
                    c++;
                    if (c==x) {
                
                        System.out.println(j);break;
                    }
                }
                
            }
          
            
        }
    
    
    
    
        }
    }
