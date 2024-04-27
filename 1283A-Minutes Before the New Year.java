import java.util.*;
public  class Layanooo{
  
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int h = in.nextInt();
            int m= in.nextInt();
            System.out.println(1440 - (h*60)-m);

        }
    }}
