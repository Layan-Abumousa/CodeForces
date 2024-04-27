import java.util.Scanner;

public class Layaannnno { 
    public static  boolean check(int x ){
    int  arr []= new int [4];
    int u=0;
    while(x>0){
    int r = x%10;
    arr[u++]=r;
    x/=10;
    
           
    }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
                
            }
        }
        return true; 
    
    }
      

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int year = in.nextInt();
         for (int i = year+1 ; i >0; i++) {
             if (check(i)==true) {
                 System.out.println(i);
                 break;
             }
        }
        
        
        
        
        
        
    }
}
