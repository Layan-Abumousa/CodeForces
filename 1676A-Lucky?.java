import java.util.*;
public  class Layanooo{

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
       int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int o = x/1000;
            int t = x%1000;
            int sum1 =0;
            int sum2=0;
            int c=0;
            while(c<3) {
            sum1+=o%10;
            o/=10;
            sum2 += t%10;
            t/=10;
              c++;
            }
            if (sum1 == sum2) {
                System.out.println("YES"); 
            }
            else
                System.out.println("NO");
          
            }

    }}
