import java.util.*;
public class Layanoooo {
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
        int x=in.nextInt();
        String s = in.next();
        int c=0;
        s=s.toLowerCase();
        int freq[]=freq(s.toCharArray());
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]!=0) {
                c++;
            }
        }
        if (c==26) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
      
    }
}
