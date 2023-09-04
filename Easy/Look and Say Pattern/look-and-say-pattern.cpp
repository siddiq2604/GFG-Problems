//{ Driver Code Starts
//Initial template for C++

#include<bits/stdc++.h> 
using namespace std;

// } Driver Code Ends
//User function template for C++

class Solution
{
  public:
    string lookandsay(int n) {
        // code here
        string s="1";
        for(int i=1;i<n;i++){
            int c=1;
            string t="";
            for(int j=0;j<=s.size()-1;j++){
                if(j+1<s.size() &&s[j]==s[j+1]){
                    c++;
                }
                else{
                    t+=c+'0';
                    t+=s[j];
                    c=1;
                }
            }
            s=t;
        }
        return s;
    }   
};

//{ Driver Code Starts.
int main() {
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        cin>>n;
        Solution obj;
        cout<<obj.lookandsay(n)<<endl;
    }
    return 0;
}
// } Driver Code Ends