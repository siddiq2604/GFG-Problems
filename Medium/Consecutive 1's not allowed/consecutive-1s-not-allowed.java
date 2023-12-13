//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());

            long ans = new Solution().countStrings(n);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    long countStrings(int n) {
        // code here
        long dp[] = new long[n+1];
        dp[1] = 2;
        dp[0] = 1;
        int mod = (int)1e9+7;
        for(int i= 2; i<=n; i++) 
            dp[i] = (dp[i-1]+dp[i-2])%mod;
        return dp[n]%mod;
    }
}