//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

// } Driver Code Ends
//User function Template for Java
class Solution{
    static long fibSum(long N){
        //code here
        if(N == 0){ 
           return 0;
       }
       if(N == 1){
           return 1;
       } 
       long a = 0; 
       long b = 1; 
       long c = 0; 
       long sum = 1; 
       for(int i=2; i<=N; i++){
           c = (a % 1000000007) + (b % 1000000007);
           sum += c;
           a = b; 
           b = c;
       }
       return sum % 1000000007;
    }
}

//{ Driver Code Starts.
class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            long N = Long.parseLong(read.readLine());
           
            Solution ob = new Solution();
            System.out.println(ob.fibSum(N));
        }
    }
}
// } Driver Code Ends