import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        in.nextLine();
        
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            in.nextLine(); 
            
            List<Set<Integer>> G = new ArrayList<>();
            int[] I = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                G.add(new HashSet<>());
            }
            
            for (int i = 0; i < k; i++) {
                String[] parts = in.nextLine().trim().split(" ");
                int[] a = new int[parts.length];
                for (int j = 0; j < parts.length; j++) {
                    a[j] = Integer.parseInt(parts[j]);
                }
                
                for (int j = 1; j < a.length - 1; j++) {
                    int from = a[j];
                    int to = a[j + 1];
                    if (!G.get(from).contains(to)) {
                        G.get(from).add(to);
                        I[to]++;
                    }
                }
            }
            
            Queue<Integer> Q = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                if (I[i] == 0) {
                    Q.add(i);
                }
            }
            
            int C = 0;
            while (!Q.isEmpty()) {
                int x = Q.poll();
                C++;
                for (int y : G.get(x)) {
                    I[y]--;
                    if (I[y] == 0) {
                        Q.add(y);
                    }
                }
            }
            
            System.out.println(C == n ? "YES" : "NO");
        }
    }
}
