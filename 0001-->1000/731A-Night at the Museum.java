import java.util.Scanner;

public class soso {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char start = 'a';
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            long l1 = Math.abs(s.charAt(i) - start);
            long l2 = 26 - Math.abs((int)l1);
            sum += Math.min(l1, l2);
            start = s.charAt(i);
        }
        System.out.println(sum);
    }
}
