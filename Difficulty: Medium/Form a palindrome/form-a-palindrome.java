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
            System.out.println(ob.findMinInsertions(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    int findMinInsertions(String s){
        // code here
        int n = s.length();
        int [][]dp = new int[n][n];
        for(int i=1;i<n;i++){
            for(int l=0,h=i;h<n;l++,h++){
                dp[l][h]=(s.charAt(l)==s.charAt(h)) ? dp[l+1][h-1] : Math.min(dp[l+1][h],dp[l][h-1])+1;
            }
        }
        return dp[0][n-1];
    }
}