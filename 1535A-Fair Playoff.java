import java.util.*;

public class Soso {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int t =in.nextInt();
        for (int i = 0; i < t; i++) {
        int arr[]= new int [4] ;
            for (int j = 0; j < 4; j++) {
                arr[j]=in.nextInt();
            }
        int f = Math.max(arr[0], arr[1]);
        int s = Math.max(arr[2], arr[3]);
        Arrays.sort(arr);
            if ((f==arr[3] &&s==arr[2] ) || (f==arr[2] &&s==arr[3])) {
                System.out.println("YES");
            }
            else 
                System.out.println("NO");
        }
        
        }}
