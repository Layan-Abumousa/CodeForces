import java.util.*;


public class soso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        boolean c = true;

        for (int i = 1; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                c = false;
                break;
            }
        }

        if (c) {
            
            for (int j = 0; j < s.length(); j++) {
                char u = s.charAt(j);
                System.out.print(Character.isLowerCase(u) ? Character.toUpperCase(u) : Character.toLowerCase(u));
            }
        } else {
            System.out.print(s);
        }

    }
}
