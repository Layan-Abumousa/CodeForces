import java.util.Scanner;

public class WaterContainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            long[] a = new long[n];
            long totalSum = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextLong();
                totalSum += a[i];
            }
            System.out.println(canEqualizeWater(n, a, totalSum) ? "YES" : "NO");
        }
    }

    private static boolean canEqualizeWater(int n, long[] a, long totalSum) {
        long average = totalSum / n;
        long expectedSum = 0, actualSum = 0;
        for (int i = 0; i < n; i++) {
            expectedSum += average;
            actualSum += a[i];
            if (actualSum < expectedSum) {
                return false;
            }
        }
        return true;
    }
}
