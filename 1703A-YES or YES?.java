import java.util.*;
public  class Mavenproject9{
    

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 0; i < n; i++) {
         String s = in.next();
         s=s.toLowerCase();
            if (s.equals("yes")) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
            
        }
        
     
    }
}

