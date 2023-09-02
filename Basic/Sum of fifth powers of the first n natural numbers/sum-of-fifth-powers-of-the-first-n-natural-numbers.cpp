//{ Driver Code Starts
// Initial template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function template for C++

class Solution {
  public:
    long long sumOfFifthPowers(long long N) {
        // code here
        long s=0;
        for(int i=2;i<=N;i++){
            s+=(long)pow(i,5);
        }
        return s+1;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        cin >> N;
        Solution ob;
        cout << ob.sumOfFifthPowers(N) << "\n";
    }
}
// } Driver Code Ends