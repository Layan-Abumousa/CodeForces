import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, n;
        long[] a = new long[55];
        long[] b = new long[55];

        t = scanner.nextInt();
        while (t-- > 0) {
            n = scanner.nextInt();
            long aMin = 1000000001, bMin = 1000000001;

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                if (aMin > a[i]) {
                    aMin = a[i];
                }
            }

            for (int i = 0; i < n; i++) {
                b[i] = scanner.nextLong();
                if (bMin > b[i]) {
                    bMin = b[i];
                }
            }

            long c = 0, m = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] > aMin && b[i] > bMin) {
                    m = Math.min(a[i], b[i]);
                    a[i] = a[i] - (m - Math.min(aMin, bMin));
                    b[i] = b[i] - (m - Math.min(aMin, bMin));
                    c += (m - Math.min(aMin, bMin));

                    if (a[i] > aMin) {
                        c += a[i] - aMin;
                        a[i] -= a[i] - aMin;
                    } else if (b[i] > bMin) {
                        c += b[i] - bMin;
                        b[i] -= b[i] - bMin;
                    }
                } else if (a[i] == aMin && b[i] > bMin) {
                    c += b[i] - bMin;
                    b[i] -= b[i] - bMin;
                } else if (a[i] > aMin && b[i] == bMin) {
                    c += a[i] - aMin;
                    a[i] -= a[i] - aMin;
                }
            }

            System.out.println(c);
        }

        scanner.close();
    }
}
