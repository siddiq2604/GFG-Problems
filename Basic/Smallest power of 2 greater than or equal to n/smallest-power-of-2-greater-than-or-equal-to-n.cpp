//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
    public:
    long long nearestPowerOf2(long long N){
        //code here
        for(int i=0;i<N;i++){
            if(pow(2,i)>=N)
              return pow(2,i);
        }
    }
};

//{ Driver Code Starts.
int main(){
    int t;
    cin>>t;
    while(t--)
    {
        long long N;
        cin>>N;
        Solution ob;
        cout<<ob.nearestPowerOf2(N)<<"\n";
    }
}
// } Driver Code Ends