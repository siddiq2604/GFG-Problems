//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    long long nthDayPage(long long N, long long K){
        // code here
        if(N==1)
        return 1;
        
        return (K*nthDayPage(N-1,K))%1000000007;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long N, K;
        cin >> N >> K;
        Solution ob;
        cout<<ob.nthDayPage(N, K)<<endl;
    }
    return 0;
}

// } Driver Code Ends