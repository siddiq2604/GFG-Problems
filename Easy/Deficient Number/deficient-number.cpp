//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++
class Solution {
  public:
    string isDeficient(long long int x) {
        // code here
        int c=0;
        for(long i=1;i<x+1;i++){
            if(x%i==0){
                c+=i;
            }
        }
        if(c<2*x){
            return "YES";
        }
        return "NO";
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        long long int x;
        cin >> x;
        Solution ob;
        cout << ob.isDeficient(x) << endl;
    }
    return 0;
}

// } Driver Code Ends