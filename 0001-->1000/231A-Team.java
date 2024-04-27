import java.util.*;

public class Layanooooo {


     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int x = in.nextInt();
         int arr[][] = new int[x][3];
         int c[]= new int[x];
         for (int i = 0; i < x; i++) {
             for (int j = 0; j < 3; j++) {
                 arr[i][j]=in.nextInt();
             }
         }
         int s=0;
         for (int i = 0; i < x; i++) {
             s=i;
             for (int j = 0; j < 3; j++) {
                 if (arr[i][j]==1) {
                     c[s]++;
                 }
             }
         }
         int f =0;
         for (int i = 0; i < c.length; i++) {
             if (c[i]>=2) {
                 f++;
             }
         }
         System.out.println(f);
}}
