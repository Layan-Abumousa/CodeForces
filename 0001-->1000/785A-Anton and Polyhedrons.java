import java.util.*;
public class Layanooooo{
 
   
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int x = in.nextInt();
      String s [] = new String [x];
        for (int i = 0; i < x; i++) {
            s[i]=in.next();
        }
        long sum=0;
        for (int i = 0; i < x; i++) {
            if (s[i].equals("Icosahedron")) {
                sum+=20;
            }
            else if (s[i].equals("Cube")) {
                sum+=6;
            }
            else  if (s[i].equals("Tetrahedron")) {
                sum+=4;
            } 
            else  if (s[i].equals("Dodecahedron")) {
                sum+=12;
            } 
            
              else {
                sum+=8;
            }
              
            
        }
        System.out.println(sum);
        
        
        
        
        
    }
}
