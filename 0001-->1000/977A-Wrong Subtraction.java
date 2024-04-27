import java.util.*;

public class Layanooooo {
    public static boolean check(int x){
    
            if (x%10==0) {
                return true;
            }
            else
                return false;
    
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y =in.nextInt();
        for (int i = 0; i < y; i++) {
            if (check(x)) {
                x/=10;
            }
            else
                x--;
        }
        System.out.println(x);
    }
}
