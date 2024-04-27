import java.util.*;

public class Layano {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int c=0;
        int arr[][]=new int[x][2];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j]=in.nextInt();
            }
        }
        for (int i = 0; i < x; i++) {
            if (arr[i][0] <= (arr[i][1]-2)) {
                c++;
            }
        }
        System.out.println(c);
        
    }
}
