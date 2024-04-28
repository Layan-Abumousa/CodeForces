import java.util.Scanner;

public class Soso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        while (t-- > 0) {
            long n = in.nextLong();
            long sum1 = 0, sum2 = 0;

            if (n % 4 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");

                for (int i = 2; i <= n; i += 2) {
                    System.out.print(i + " ");
                    sum1 += i;
                }

                for (int i = 1; i < n - 2; i += 2) {
                    System.out.print(i + " ");
                    sum2 += i;
                }

                System.out.println(sum1 - sum2);
            }
        }

        in.close();
    }
}
