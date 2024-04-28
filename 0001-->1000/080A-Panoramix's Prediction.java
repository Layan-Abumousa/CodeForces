import java.util.ArrayList;
import java.util.Scanner;

public class Soso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        int N = 1;
        int M = 51;
        ArrayList<Integer> v = new ArrayList<>();

        while (N < M) {
            int flag = 0;
            for (int i = 2; i <= N / 2; i++) {
                if (N % i == 0) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0)
                v.add(N);

            N++;
        }

        int flag = 0;
        for (int i = 0; i < v.size() - 1; i++) {
            if ((v.get(i) == n) && (v.get(i + 1) == m)) {
                flag = 1;
                break;
            } else
                flag = 0;
        }

        if (flag == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
