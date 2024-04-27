import java.util.*;

public class Layanooooo {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String s = in.next();
        int c=0;
        char arr[]=s.toCharArray();
        for (int i = 0; i < s.length()-1; i++) {
            if (arr[i]==arr[i+1]) {
                c++;
            }
        }
        
        System.out.println(c);
        
       
    }
}
