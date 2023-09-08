//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution{
	public:
   	long long int Nth_mileSpeed(int n){
   	    // Code here
   	    if(n%2==0)
           return 7*pow(3,(n/2)-1);
       else
           return pow(((n-1)/2)+1,4);
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
		long long int ans = ob.Nth_mileSpeed(n);
		cout << ans <<"\n";
	}  
	return 0;
}
// } Driver Code Ends