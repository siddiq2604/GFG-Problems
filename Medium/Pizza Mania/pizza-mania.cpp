//{ Driver Code Starts

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
    vector<int> dp;
    int solve(int Need, vector<int> &size, vector<int> &cost){
        if(Need <= 0)return 0;
        if(dp[Need] != -1)return dp[Need];
        int takeSmall = cost[0] + solve( Need-size[0], size, cost ) ;
        int takeMedium = cost[1] + solve( Need-size[1], size, cost ) ;
        int takeLarge = cost[2] + solve( Need-size[2], size, cost ) ;
        
        return dp[Need] = min( {takeSmall, takeMedium, takeLarge} );
    }
  public:
    int getPizza(int X, int S, int M, int L, int CS, int CM, int CL) {
        vector<int> size = {S, M, L};
        vector<int> cost = {CS, CM, CL};
        dp = vector<int> (X+1, -1);
        return solve(X, size, cost);
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int X,S,M,L,CS,CM,CL;
        
        cin>>X>>S>>M>>L>>CS>>CM>>CL;

        Solution ob;
        cout << ob.getPizza(X,S,M,L,CS,CM,CL) << endl;
    }
    return 0;
}
// } Driver Code Ends