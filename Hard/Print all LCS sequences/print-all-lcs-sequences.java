//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String ss = br.readLine();
            String[] S = ss.split(" ");
            String s = S[0];
            String t = S[1];
            Solution ob = new Solution();
            List<String> ans = new ArrayList<String>();
            ans = ob.all_longest_common_subsequences(s, t);
            for(int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i) + " ");
            }
            System.out.println();
        }
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    Map<String, Boolean> m = new HashMap<>();
    List<String> v = new ArrayList<>();

    public void recur(String str, int[][] dp, int row, int col, int num, String s, String t) {
        if (num == 0) {
            StringBuilder sb = new StringBuilder(str);
            sb.reverse();
            if (!m.containsKey(sb.toString())) {
                v.add(sb.toString());
                m.put(sb.toString(), true);
            }
            return;
        }
        for (int i = row; i >= 0; i--) {
            for (int j = col; j >= 0; j--) {
                if (dp[i][j] < num) break;
                if (dp[i][j] == num && t.charAt(i - 1) == s.charAt(j - 1)) {
                    recur(str + t.charAt(i - 1), dp, i - 1, j - 1, num - 1, s, t);
                }
            }
        }
    }

    public List<String> all_longest_common_subsequences(String s, String t) {
        int r = t.length();
        int c = s.length();
        int[][] dp = new int[r + 1][c + 1];
        
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (t.charAt(i - 1) == s.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        
        List<int[]> posi = new ArrayList<>();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (dp[i][j] == dp[r][c] && t.charAt(i - 1) == s.charAt(j - 1)) {
                    posi.add(new int[]{i, j});
                }
            }
        }
        
        int len = dp[r][c];
        for (int[] x : posi) {
            int i = x[0];
            int j = x[1];
            String str = String.valueOf(t.charAt(i - 1));
            recur(str, dp, i - 1, j - 1, len - 1, s, t);
        }
        
        Collections.sort(v);
        return v;
    }
}