//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    bool isPrime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    long long nthMysterious(long long N){
        // code here
        vector<long long> v;
        for(int i=2;i<=7925;i++){
            if(isPrime(i)==true)
            v.push_back(i);
        }
        return (v[N-1]*v[N-1])+1;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long N;
        cin >> N;
        Solution ob;
        cout << ob.nthMysterious(N) << endl;
    }
    return 0;
}

// } Driver Code Ends