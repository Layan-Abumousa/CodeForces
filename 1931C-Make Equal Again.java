import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            solve(scanner);
        }
    }

    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int l = 0, r = n - 1;
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1 && a[i + 1] == a[i]; ++i) {
            l++;
        }
        for (int i = n - 1; i > 0 && a[i - 1] == a[i]; --i) {
            r--;
        }
        if (l == n - 1) {
            System.out.println("0");
        } else if (a[r] == a[l]) {
            System.out.println(r - l - 1);
        } else {
            System.out.println(Math.min(n - 1 - l, r));
        }
    }
}
