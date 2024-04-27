import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong(), x = in.nextLong(), y = in.nextLong();
            Map<Pair, Integer> mp = new HashMap<>();
            long[] v = new long[(int) n];

            for (int i = 0; i < n; i++) {
                v[i] = in.nextLong();
                Pair temp = new Pair((x - v[i] % x) % x, v[i] % y);
                mp.put(temp, mp.getOrDefault(temp, 0) + 1);
            }

            long ans = 0;
            for (int i = 0; i < n; i++) {
                Pair temp = new Pair((x - v[i] % x) % x, v[i] % y);
                mp.put(temp, mp.get(temp) - 1); // Decrement count for current element
                ans += mp.getOrDefault(new Pair(v[i] % x, v[i] % y), 0);
            }

            System.out.println(ans);
        }
    }

    static class Pair {
        long first, second;

        Pair(long first, long second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Pair)) return false;
            Pair pair = (Pair) o;
            return first == pair.first && second == pair.second;
        }

        @Override
        public int hashCode() {
            return (int) (31 * first + second);
        }
    }
}
