//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    int nthTerm(int n){
        // code here
        int a[n];
        a[0]=7;
        for(int i=1;i<=n;i++){
            a[i]=(a[i-1]<<1)+i;
            if(a[i]>=1000000007)
            a[i]-=1000000007;
        }
        return a[n-1];
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        
        Solution ob;
        cout<<ob.nthTerm(n)<<"\n";
    }
    return 0;
}
// } Driver Code Ends