//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            
            String S = read.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.longestPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    String longestPalindrome(String s){
       int n = s.length();
        if(n==1)
            return s;
        char c = s.charAt(0);
        String res = Character.toString(c);
        int max=1,st=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String str = s.substring(i,j+1);
                if(isPal(str))
                {
                    if(str.length()>max)
                    {
                        max = str.length();
                        res = str;
                    }
                }
            }
        }

        return res;
    }
    static boolean isPal(String s){
        int i=0,j=s.length()-1;

        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            else{
                i++;
                j--;
            }
        }

        return true;
    }
}