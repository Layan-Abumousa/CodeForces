import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0)
            red(in);
    }

    public static void red(Scanner in) {
        int n = in.nextInt();
        int m = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < n; ++i) {
            int num = in.nextInt();
            String s = Integer.toString(num);
            int cnt = 0;
            for (int j = s.length() - 1; j >= 0; --j) {
                if (s.charAt(j) != '0')
                    break;
                cnt++;
            }
            arr.add(cnt);
            ans += s.length() - cnt;
        }
        Collections.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < arr.size(); ++i) {
            if (i % 2 != 0)
                ans += arr.get(i);
        }
        if (ans > m)
            System.out.println("Sasha");
        else
            System.out.println("Anna");
    }
}
