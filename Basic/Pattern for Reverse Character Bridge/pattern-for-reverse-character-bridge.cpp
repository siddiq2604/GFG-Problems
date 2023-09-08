//{ Driver Code Starts
//Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
  public:
    vector<string> revCharBridge(int N) {
        // code here
        vector<string> ans;
        for(int i=N;i>=1;--i){
            int count=0;
            string s="";
            for(int j=0;j<(2*N-1);++j){
                if(j<i || j>=(2*N-i-1))
                s+=(char)('A'+count);
                else
                s+=' ';
                if(j<(N-1)){
                    count++;
                }else{
                    count--;
                }
            }
            ans.push_back(s);
        }
        return ans;
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int N;
        
        cin>>N;

        Solution ob;
        vector<string> v = ob.revCharBridge(N);
        
        for(int i=0; i<v.size(); i++)
            cout<<v[i]<<endl;
    }
    return 0;
}
// } Driver Code Ends