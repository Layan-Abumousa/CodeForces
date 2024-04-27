import java.util.*;
public  class Layanooo{
  
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     int n = in.nextInt();
     int c=0;
        for (int k = 0; k < n; k++) {
            
        c=0;
     int []arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i]=in.nextInt();
            
        }
        for (int i = 1 ;i < 4; i++) {
            if (arr[i]>arr[0]) {
                c++;
            }
        }
        System.out.println(c);
        }
           
    }}
