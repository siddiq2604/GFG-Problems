//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    vector<int> connellSequence(int n){
        // code here
        int a=1;
        vector<int> v;
        for(int i=1;i<=n;i++){
            int j=0;
            while(j<i && v.size()<n){
               v.push_back(a);
               j++;
               if(j<i){
                  a+=2;
               }
            }
            a++;
        }
        return v;
        
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
        vector<int> ans = ob.connellSequence(n);
        for(int u: ans)
            cout<<u<<" ";
        cout<<endl;
    }
    return 0;
}
// } Driver Code Ends