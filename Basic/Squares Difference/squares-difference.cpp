//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

// User function Template for C++
class Solution {
  public:
    long long int squaresDiff(int N){
        // code here
        return abs((N*(N+1)*(2*N+1))/6 - pow(N*(N+1)/2, 2));
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
        cout << ob.squaresDiff(N) << endl;
    }
    return 0;
}

// } Driver Code Ends