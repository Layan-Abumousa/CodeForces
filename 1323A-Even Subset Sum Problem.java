
import java.util.*;

public class Layanooooo {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        for (int i = 0; i < x; i++) {
            int size = in.nextInt();
        int arr[]= new int[size];
           for (int j = 0; j < size; j++) {
                arr[j]=in.nextInt();
            }
            
            if (size == 1 && arr[0]%2==1)  {
                System.out.println(-1);
            }
            else
		{
			if(arr[0]%2==0)
			{
                         System.out.println(1);
                            System.out.println(1);
			}
			else if(arr[1]%2==0)
			{
				 System.out.println(1);
                            System.out.println(2);
			}
			else
			{
                            System.out.println(2);
                            System.out.println(1+" "+2);
				
			}
		}
        }
        
        
       
    }
}

