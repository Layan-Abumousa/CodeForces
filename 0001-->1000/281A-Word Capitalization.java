import java.util.*;

public class Layanooooo {


     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String s = in.next();
         if (s.charAt(0)>=65&&s.charAt(0)<=90 ) {
             System.out.println(s);
         }
         else{
             s=(char)(s.charAt(0)-32)+s.substring(1);
             System.out.println(s);
         }
}}
