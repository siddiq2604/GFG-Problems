//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int[] a = new int[3];
        int j = 0, ans = Integer.MAX_VALUE, cnt = 0;
        int n = S.length();

        for (int i = 0; i < n; i++) {
            if (a[S.charAt(i) - '0'] == 0) {
                cnt++;
            }
            a[S.charAt(i) - '0']++;

            while (cnt == 3) {
                ans = Math.min(ans, i - j + 1);
                a[S.charAt(j) - '0']--;

                if (a[S.charAt(j) - '0'] == 0) {
                    cnt--;
                }
                j++;
            }
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
};
