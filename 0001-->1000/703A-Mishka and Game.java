import java.util.Scanner;

public class Soso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m, c;
        int winM = 0, winC = 0, draw = 0;

        for (int i = 0; i < n; i++) {
            m = in.nextInt();
            c = in.nextInt();

            if (m > c)
                winM++;
            else if (m < c)
                winC++;
            else if (m == c)
                draw++;
        }

        if (draw == n || winM == winC)
            System.out.println("Friendship is magic!^^");
        else if (winM > winC)
            System.out.println("Mishka");
        else
            System.out.println("Chris");

        in.close();
    }
}
