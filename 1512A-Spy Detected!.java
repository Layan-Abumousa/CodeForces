    import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            for (int j = 0; j < n; j++) {
                int tmp = 0;
                for (int k = 0; k < n; k++) {
                    if (a[j] == a[k]) tmp++;
                }
                if (tmp == 1) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
}
