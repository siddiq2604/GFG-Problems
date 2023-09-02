//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    long long int nthEvenFibonacci(long long int N) {
        // code here
        if(N==1)
        return 2;
        if(N==2)
        return 8;
        long long int a=2,b=8,c;
        for(long long int i=3;i<=N;i++){
            c=(a+4*b)%1000000007;
            a=b;
            b=c;
        }
        return c;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long int n;
        cin >> n;
        Solution ob;
        cout << ob.nthEvenFibonacci(n) << endl;
    }
    return 0;
}

// } Driver Code Ends