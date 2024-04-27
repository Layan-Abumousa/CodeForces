
import java.util.*;

public class Layanooooo {
   
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String s =in.next();
        int cd=0;
        int ca=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch=='A') {
                ca++;
            }
            else
                cd++;
        }
        if (ca>cd) {
            System.out.println("Anton");
        }
        else if (cd>ca) {
            System.out.println("Danik");
        }
        else
            System.out.println("Friendship");
    }
}
