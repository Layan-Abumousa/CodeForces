import java.util.*;

public class Soso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i, k, count;
        int n;

        Queue<Integer> one = new LinkedList<>();
        Queue<Integer> two = new LinkedList<>();
        Queue<Integer> three = new LinkedList<>();

        n = in.nextInt();

        for (i = 1; i <= n; i++) {
            k = in.nextInt();

            if (k == 1)
                one.add(i);
            else if (k == 2)
                two.add(i);
            else if (k == 3)
                three.add(i);
        }

        int min = 100000;

        if (min > one.size())
            min = one.size();

        if (min > two.size())
            min = two.size();

        if (min > three.size())
            min = three.size();

        System.out.println(min);

        for (i = 1; i <= min; i++) {
            System.out.println(one.poll() + " " + two.poll() + " " + three.poll());
        }
    }
}
