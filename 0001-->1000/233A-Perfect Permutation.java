import java.util.*;

public class soso {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int n = in.nextInt();
        if (n%2==1) {
            System.out.println(-1 );return;
        }
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=i+1;
        }

        for (int i = 0; i < n -1; i+=2) {
            int temp = arr[i]; 
    arr[i] = arr[i+1]; 
    arr[i+1] = temp;  
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
