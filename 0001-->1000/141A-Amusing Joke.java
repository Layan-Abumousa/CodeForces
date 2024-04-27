import java.util.*;
public class Layanooo{
        
public static int[] freq(char arr[]){
     int freq[]= new int [26];
     for (int i = 0; i < arr.length; i++) {
         char ch = arr[i];
         freq[(int)(ch-'A')]++;
     }
     
     
     return freq;
 }
   
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      String s1 = in.next();
     
      int freq1[]=freq(s1.toCharArray());
      
      String s2 = in.next();
      int freq2[]=freq(s2.toCharArray());
      String s3 = in.next();
      int freq[]= new int [26];
      int c=0;
      int freq3[]=freq(s3.toCharArray());
        for (int i = 0; i < freq1.length; i++) {
            freq[i]=freq1[i]+freq2[i];
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i]==freq3[i]) {
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
