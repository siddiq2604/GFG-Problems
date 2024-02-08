//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;
 

// } Driver Code Ends
class Solution
{
    public:
   long long mod=1e9+7;
    long long power(long long int a,long long int b){
        long long ans=1;
        while(b){
            if(b&1) ans=(ans*a)%mod;
   a=(a*a)%mod;
   b=b>>1;
        }
        return ans;
    }

    long long  numberOfPaths(int M, int N)
    {
      long long  n=1ll*M+1ll*N-2;
       int r=1ll*M-1;
       long long int ans=1;
       for(int i=0;i<r;i++){
           ans=(ans%mod*(n-i)%mod)%mod;
           ans=(ans%mod*power(i+1,mod-2))%mod;
       }
       return ans;
    }
       
};


//{ Driver Code Starts.

 
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int N, M;
		cin>>M>>N;
		Solution ob;
	    cout << ob.numberOfPaths(M, N)<<endl;
	}
    return 0;
}
// } Driver Code Ends