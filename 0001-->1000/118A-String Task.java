import java.util.*;

public class Soso {
  public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s = in.next(),res="";
        s=s.toLowerCase();
        String v = "aiyoue";
        for (int i = 0; i < s.length(); i++) {
            if (v.indexOf(s.charAt(i))!=-1) {
                continue;
            }
            else{
            res += '.';
            res += s.charAt(i);  }    }
        System.out.println(res);
        
  }}
