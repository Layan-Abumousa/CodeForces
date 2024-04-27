import java.util.*;
public  class Layanooo{
  
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     String s = in.next();
     String res = "";
   
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '.' ) {
                res+='0';
            }
            else if (ch == '-' && s.charAt(i+1)=='-'){
            i++;
            res+='2';
            }
            else
            {
                i++;
                res+='1';
                        
            }
        }
           System.out.println(res);
    }}
