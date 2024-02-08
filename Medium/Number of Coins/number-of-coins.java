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
                    int v = sc.nextInt();
                    int m = sc.nextInt();
                    int coins[] = new int[m];
                    for(int i = 0;i<m;i++)
                        coins[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minCoins(coins, m, v));
                }
        }
}    
// } Driver Code Ends


class Solution{

	public int minCoins(int coin[], int N, int V) 
	{ 
	    // Your code goes here
	    if (V == 0)
            return 0;
        int dp[] = new int[V + 1];
        Arrays.fill(dp, V + 1);
        dp[0] = 0;
        for (int i = 1; i <= V; i++) {
            for (int j = 0; j < N; j++) {
                if (coin[j] <= i) {
                    int sub_res = dp[i - coin[j]];
                    if (sub_res != V + 1 && sub_res + 1 < dp[i])
                        dp[i] = sub_res + 1;
                }
            }
        }
        return dp[V] > V ? -1 : dp[V];
	} 
}