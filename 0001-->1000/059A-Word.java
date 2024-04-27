import java.util.*;

public class Layanooooo {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int arr[]=new int[2];
         String s=in.next();
         String ss="";
         for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
             if (ch>=65 && ch<= 90) {
                 arr[0]++;
             }
             else
                 arr[1]++;
        }
         if (arr[0]>arr[1]) {
             for (int i = 0; i < s.length(); i++) {
                 char ch = s.charAt(i);
                 if (ch>=97 && ch<=122) {
                     ss+=(char)(ch-32);
                 }
                 else
                     ss+=ch;
             }
        }
         else
             for (int i = 0; i < s.length(); i++) {
                 char ch = s.charAt(i);
                 if (ch>=65 && ch<=90) {
                     ss+=(char)(ch+32);
                 }
                 else
                     ss+=ch;
             }
        System.out.println(ss);
         
    }
}
