import java.util.*;
public  class Layanooo{
  
   
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
       int n = in.nextInt(); 
      
        for (int i = 0; i < n; i++) {
           String s = in.next();
           String res = "";
            for (int j = 0; j < s.length(); j+=2) {
                res+=s.charAt(j);
            }
            if (s.length()>=2) {
                res+=s.charAt(s.length()-1);
            }
            
            System.out.println(res);
            
            
            
            
        }
    
    
    
    
        }
    }
