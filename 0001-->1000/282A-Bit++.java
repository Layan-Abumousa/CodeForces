import java.util.*;

public class Layanooooo {


     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         long  s =in.nextLong();
        String ss;
        
         int x =0;
         for (int i = 0; i < s; i++) {
             ss=in.next();
             if (ss.charAt(0)=='+') {
                 ++x;
             }
             else if (ss.charAt(0)=='-') {
                 --x;
             }
             else if (ss.charAt(ss.length()-1)=='-') {
                 x--;
             }
            else
                 x++;
         }
         System.out.println(x);
     
}}
