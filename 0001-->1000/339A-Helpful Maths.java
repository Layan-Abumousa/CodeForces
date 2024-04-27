import java.util.*;

public class Layanooooo {


     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String s = in.next();
        String ss="";
        int c1=0,c2=0,c3=0;
         for (int i = 0; i < s.length(); i++) {
             char ch = s.charAt(i);
             if (ch=='1') {
                 c1++;
             }
             else if (ch=='2') {
                 c2++;
             }
             else if (ch=='3') {
                 c3++;
             }
         }
         for (int i = c1; i >0; i--) {
             ss+="1"+"+";
         }
        
         for (int i = c2; i >0; i--) {
             ss+="2"+"+";
         }
          for (int i = c3; i >0; i--) {
             ss+="3"+"+";
         }
          
          System.out.println(ss.substring(0, ss.length()-1));
     
}}
