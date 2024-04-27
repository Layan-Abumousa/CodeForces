import java.util.*;

public class Layanooooo {
public static int[] freq(char arr[]){
     int freq[]= new int [26];
     for (int i = 0; i < arr.length; i++) {
         char ch = arr[i];
         freq[(int)(ch-'a')]++;
     }
     
     
     
     
     return freq;
 }

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        String s = in.next();
        char arr[]=s.toCharArray();
        int freq[]=freq(arr);
        int c=0;
         for (int i = 0; i < 26; i++) {
             if (freq[i]>0) {
                 c++;
             }
         }
         if (c%2==0) {
             System.out.println("CHAT WITH HER!");
         }
         else
             System.out.println("IGNORE HIM!");
}}
