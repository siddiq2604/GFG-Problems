//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.lucas(n));
                }
        }
}    
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long lucas(int n)
        {
            //code here.
            long a=2,b=1,c=0;
            if(n==0) return 2;
            else if(n==1) return 1;
            for(int i=2;i<=n;i++){
                c=(a+b)%1000000007;
                a=b%1000000007;
                b=c%1000000007;
            }
            return c;
        }
        
};
