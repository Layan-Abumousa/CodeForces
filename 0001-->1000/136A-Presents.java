import java.util.*;

public class Layano {
   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int arr[]= new int[x];
        int c=0;
        for (int i = 0; i < x; i++) {
            arr[i]=in.nextInt();
        }
        
        for (int i = 0; i < x; i++) {
            c++;
            for (int j = 0; j < x; j++) {
                if (arr[j]==c) {
                    System.out.println(j+1);
                }
            }
        }
      
        
        
    }
}
