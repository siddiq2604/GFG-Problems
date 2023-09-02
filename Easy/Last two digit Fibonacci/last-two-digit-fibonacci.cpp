//{ Driver Code Starts
// Initial Template for C++
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution{
    public:
    int fibonacciDigits(long long N){
        //code here
        int a=1,b=1,c;
        N=N%300;
        if(N==1 || N==2)
        return 1;
        for(long i=3;i<=N;i++){
            c=(a+b)%100;
            a=b%100;
            b=c%100;
        }
        return c;
    }
};

//{ Driver Code Starts.
int main(){
    int t;
    cin>>t;
    while(t--){
        long long N;
        cin>>N;
        Solution ob;
        int ans=ob.fibonacciDigits(N);
        if(ans/10)
         cout<<ans;
        else
         cout<<0<<ans;
        cout<<"\n";  
    }
}
// } Driver Code Ends