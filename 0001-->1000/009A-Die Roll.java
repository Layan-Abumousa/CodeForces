import java.util.Scanner;

public class Layanoo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int y = in.nextInt();
        int w = in.nextInt();

        String[] s = {"", "1/1", "5/6", "2/3", "1/2", "1/3", "1/6"};
        int d = Math.max(y, w);

        System.out.println(s[d]);

    }
}
