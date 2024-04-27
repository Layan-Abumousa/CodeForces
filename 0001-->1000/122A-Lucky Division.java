import java.util.Scanner;

public class Layaannnno { 
        static public boolean lucky(int x){
        int c7=0;
        int c4=0;
        int c=0;
        int y=x;
        while(x>0){
        int r = x%10;
        c++;
            if (r == 4 ) {
                c4++;
            }
            else if (r==7) {
                c7++;
            }
        x/=10;
        
        }
        if (c4==c || c7==c ||(c7+c4)==c ) {
            return true;
        }
        else 
            return false ;
        
        }
        static public boolean ss(int x){
            for (int i = 1; i <= x; i++) {
                if (lucky(i)==true) {
                    if (x%i==0) {
                        return true;
                    }
                }
            }
        return false;
        
        }

    static public boolean ch(int x){
        int c7=0;
        int c4=0;
        int c=0;
        int y=x;
        while(x>0){
        int r = x%10;
        c++;
            if (r == 4 ) {
                c4++;
            }
            else if (r==7) {
                c7++;
            }
        x/=10;
        
        }
        if (c4==c || c7==c ||(c7+c4)==c ) {
            return true;
        }
        else if ((c4==0 ||c7==0) && ss(y)  ){
            return true;
        }
        else return false;
    
    
    }
      

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        int x =in.nextInt();
        
        
        if (ch(x)==true) {
            System.out.println("YES");
        }
        else
            System.out.println("NO");
        
        
        
    }
}
