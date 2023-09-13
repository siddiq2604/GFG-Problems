//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    long long primeProduct(long long L, long long R){
        // code here
        long n=1;
        for(long i=L;i<=R;i++){
            if(f(i)){
                n=(n*i)%1000000007;
            }
        }
        return n;
    }
    bool f(long long M){
        if(M<=1)
        return false;
        if(M==2)
        return true;
        if(M%2==0)
        return false;
        for(int i=3;i*i<=M;i++){
            if(M%i==0){
              return false;
            }
        }
        return true;
    
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        long long L, R;
        cin>>L>>R;
        
        Solution ob;
        cout<<ob.primeProduct(L, R)<<"\n";
    }
    return 0;
}
// } Driver Code Ends