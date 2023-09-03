//{ Driver Code Starts
//Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++
class Solution {
  public:
    int nthTerm(int n){
        // code here
        int N = 60000;
	    bool sieve[N+1];
	    for(int i=0;i<=N;++i){
	        if(i==0 || i==1) sieve[i] = false;
	        else sieve[i] = true;
	    }
	    
	    for(int i=2;i*i<=N;++i){
	        if(sieve[i]){
	            for(int j=i*i;j<=N;j+=i){
	                sieve[j] = false;
	            }
	        }
	    }
	    
	    vector<int> primes;
	    for(int i=2;i<=N;++i){
	        if(sieve[i]) primes.push_back(i);
	    }
	    
	    return n*(primes[n-1]+1);
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int  n;
        cin >> n;
        Solution ob;
        cout<<ob.nthTerm(n)<<endl;
    }
    return 0;
}

// } Driver Code Ends