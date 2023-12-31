//{ Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}


// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          //Your code here
          int n = str.length();
    if (n == 0) {
        return "";
    }

    StringBuilder encoded = new StringBuilder();
    int count = 1;
    char current = str.charAt(0);

    for (int i = 1; i < n; i++) {
        char next = str.charAt(i);
        if (current == next) {
            count++;
        } else {
            encoded.append(current).append(count);
            current = next;
            count = 1;
        }
    }
    encoded.append(current).append(count);

    return encoded.toString();
          
	}
	
 }