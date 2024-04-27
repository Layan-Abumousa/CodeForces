import java.util.*;

public class Layanoo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        
        int[] arr = new int[s];
        for (int i = 0; i < s; i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[s -1];
        int sum = 0 ;
        for (int i = 0; i < s; i++) {
            sum+=Math.abs(max-arr[i]);
        }
        System.out.println(sum);
        
    }
}
