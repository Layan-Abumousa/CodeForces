import java.util.*;

public class Layanooooo {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        String rev="";
        for (int i = s1.length()-1; i>=0; i--) {
            rev+=s1.charAt(i);
        }
        if (s2.equals(rev)) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
        
    }
}
