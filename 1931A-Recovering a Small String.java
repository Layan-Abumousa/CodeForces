import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            System.out.println(findSmallestWord(n));
        }
    }

    private static String findSmallestWord(int sum) {
        int[] word = {1, 1, 1}; // 'aaa'
        int currentSum = 3;
        for (int i = 2; i >= 0 && currentSum < sum; i--) {
            int add = Math.min(26 - word[i], sum - currentSum);
            word[i] += add;
            currentSum += add;
        }
        return "" + (char)(word[0] + 'a' - 1) + (char)(word[1] + 'a' - 1) + (char)(word[2] + 'a' - 1);
    }
}
