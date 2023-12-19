//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            
            String s = sc.next();
            
            int answer = new Solution().isRotatedPalindrome(s);
    		System.out.println(answer);
        }
        
    }
}


// } Driver Code Ends


//User function Template for Java

class Solution
{
    int isRotatedPalindrome(String s)
    {
        // Your Code Here 
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (isPal(s.substring(i) + s.substring(0, i))) {
                return 1;
            }
        }
        return 0;
    }

    boolean isPal(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}