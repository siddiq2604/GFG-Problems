//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    bool f(int M){
        if(M<=1)
        return false;
        if(M==2 || M==3)
        return true;
        if(M%2==0 || M%3==0)
        return false;
        for(int i=5;i*i<=M;i=i+6){
            if(M%i==0 || M%(i+2)==0){
              return false;
            }
        }
        return true;
    }
    vector<int> primeDivision(int N){
        // code here
        vector<int> v;
        for(int i=2;i<=N;i++){
        if(f(i)&&f(N-i)){
            v.push_back(i);
            v.push_back(N-i);
        }
        }
        return v;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        
        Solution ob;
        vector<int> ans = ob.primeDivision(N);
        cout<<ans[0]<<" "<<ans[1]<<"\n";
    }
    return 0;
}
// } Driver Code Ends