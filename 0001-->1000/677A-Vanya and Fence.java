import java.util.*;

public class Layanooooo {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x=in.nextInt();
        int h=in.nextInt();
        int arr[]=new int [x];
        int c=0;
        for (int i = 0; i < x; i++) {
            arr[i]=in.nextInt();
        }
        for (int i = 0; i < x; i++) {
            if (arr[i]<=h) {
                c++;
            }
            else
                c+=2;
        }
        
        System.out.println(c);
    }
}
