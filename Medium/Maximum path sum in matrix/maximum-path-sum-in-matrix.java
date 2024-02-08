//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int Matrix[][] = new int[N][N];
            for(int i = 0; i < N*N; i++)
                Matrix[(i/N)][i%N] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(N, Matrix));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int maximumPath(int N, int Matrix[][])
    {
        // code here
        int dp[][] = new int[N][N];
        for(int i = 0 ; i<N ; i++){
          dp[0][i] = Matrix[0][i];
        }
        for(int row = 1 ; row<N ; row++){
            for(int col = 0 ; col<N ; col++){
                int down = Matrix[row][col] + dp[row-1][col];
                int left = (int)(-1e9 + 7) , right = (int)(-1e9 + 7);
                if(col-1 >= 0) left = Matrix[row][col] + dp[row-1][col-1];
                if(col+1 < N) right = Matrix[row][col] + dp[row-1][col+1];
                dp[row][col] = Math.max(down , Math.max(left , right));
            }
        }
        
        int ans = 0;
        for(int i = 0 ; i<N ; i++){
           ans = Math.max(dp[N-1][i] , ans);
       }
       
       return ans;
    }
}