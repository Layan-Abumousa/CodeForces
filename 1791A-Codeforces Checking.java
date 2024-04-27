import java.util.*;
public  class Layanoo{
  
   	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
                for (int i = 0; i < n; i++) {
                char ch =in.next().charAt(0);
                String letterAsString = String.valueOf(ch);

                    if ("codeforces".contains(letterAsString)) {
                        System.out.println("yes");
                    }
                    else
                        System.out.println("no");
            }
                
	}
     
        
    
        }
