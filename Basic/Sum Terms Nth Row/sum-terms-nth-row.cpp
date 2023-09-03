//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution{
	public:
   	int Nth_rowSum(int n){
   	    // Code here.
   	    int s=0;
   	    for(int i=1;i<=n*2;i++){
   	        s=(s+(n*(n-1)+i))%1000000007;
   	    }
   	    return s;
   	}    
};

//{ Driver Code Starts.
int main(){
	int tc;
	cin >> tc;
	while(tc--){
		int n;
		cin >> n;
		Solution ob;
		int ans = ob.Nth_rowSum(n);
		cout << ans <<"\n";
	}  
	return 0;
}
// } Driver Code Ends