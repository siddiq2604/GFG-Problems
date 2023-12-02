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
            int n = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.minStep(n));
        }
    }
}
// } Driver Code Ends


class Solution{
    public int minStep(int n)
    {
        // code here
        int source = 1,i=1,j=1;
        int sink = n;int count=0;
        
        while(sink!=1){
            if(sink%3== 0){
                sink/=3;
                count++;
            }
            else{
                sink-=1;
                count++;
            }
        }
        return count;
    }
}
