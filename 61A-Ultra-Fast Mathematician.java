import java.util.*;

public class Layano {
public static String decimalToBinary(int decimalNumber) {
        return Integer.toBinaryString(decimalNumber);
    }

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String ss=in.next();
        String a="";
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            char chh=ss.charAt(i);
            if (ch==chh) {
                a+='0';
                
            }
            else
                a+='1';
        }
        
        System.out.println(a);
      
        
        
    }
}
