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
        // code here
        int n = s.length();
        int max=1,s1=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int flag=1;
                for(int k=0;k<(j-i+1)/2;k++){
                    if(s.charAt(i+k)!=s.charAt(j-k)){
                        flag=0;
                        break;
                    }
                }
                if(flag!=0 && (j-i+1)>max){
                    s1=i;
                    max=j-i+1;
                }
            }
        }
        return s.substring(s1,s1+max);
    }
}