import java.util.*;
public  class Mavenproject9{
    
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
        Random r = new Random();
        String s = in.nextLine();
        s=s.replace(",", "");
        s=s.replace("{", "");
        s=s.replace("}", "");
                s=s.replace(" ", "");

        int c= 0;
        char ss[] = s.toCharArray();
        int sss[]=freq(ss);
        for (int i = 0; i < sss.length; i++) {
            if (sss[i]!=0) {
                c++;
            }
        }
        System.out.println(c);
        
     
    }
}

