import java.util.*;

public class C {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     String s = " ";
     String ss = " ";
        for (int i = 0; i < n; i++) {
            s = in.next();
            if (s.length()<=10) {
                System.out.println(s);
            }
            else {
                System.out.print((char)s.charAt(0));
                System.out.print(s.length()-2);
                System.out.println((char)s.charAt(s.length()-1));

            
            }
       
        
        }
        
    }
}
