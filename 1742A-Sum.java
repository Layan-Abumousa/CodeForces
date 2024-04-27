import java.util.*;
public  class Laynooo{

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        for (int i = 0; i < n; i++) {
         int[] arr= new int[3];
         int sum =0;
            for (int j = 0; j < 3; j++) {
                arr[j] = in.nextInt();
            }
                     Arrays.sort(arr);

            for (int j = 0; j < 2; j++) {
                sum+=arr[j];
            }
            if (sum==arr[arr.length-1]) {
                System.out.println("YES");
            }
            else
                System.out.println("NO");
            
        }
        
     
    }
}

