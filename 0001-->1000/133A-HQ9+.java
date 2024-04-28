import java.util.Scanner;

public class Layanoo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int flag = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 33 && ch <= 126) {
                if (ch == 'H' || ch == 'Q' || ch == '9') {
                    flag = 1;
                }
            }
        }

        if (flag == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
