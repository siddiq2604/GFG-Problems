//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
// User function Template for C++

class Solution {
  public:
    string betterString(string str1, string str2) {
        // code here
         int a = countSubSeq(str1);
    int b = countSubSeq(str2);
    if (a >= b) {
        return str1;
    } else {
        return str2;
    }
}

int countSubSeq(string &str) {
    int n = str.size();
    int dp[n + 1] = {};
    int mod = 1e9 + 7;

    // Initialize with an empty subsequence
    dp[0] = 1;

    // Initialize the last position of each character
    vector<int> lastPos(26, -1);

    for (int i = 1; i <= n; i++) {
        dp[i] = (2 * dp[i - 1]) % mod;

        // If the character has occurred before, subtract the count of subsequences
        if (lastPos[str[i - 1] - 'a'] != -1) {
            dp[i] = (dp[i] - dp[lastPos[str[i - 1] - 'a'] - 1] + mod) % mod;
        }

        // Update the last position of the current character
        lastPos[str[i - 1] - 'a'] = i;
    }

    return (dp[n] - 1 + mod) % mod;  // Subtract 1 to get the count of distinct subsequences
}
};

//{ Driver Code Starts.

int main() {
    int t;
    cin >> t;
    while (t--) {
        string str1, str2;
        cin >> str1 >> str2;
        Solution obj;
        string ans = obj.betterString(str1, str2);
        cout << ans << "\n";
    }
}

// } Driver Code Ends