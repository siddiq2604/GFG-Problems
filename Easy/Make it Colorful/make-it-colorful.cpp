//{ Driver Code Starts
// Initial Template for C++

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function Template for C++

class Solution{
public:
    vector<int> extraCount(string s){
        // code here
        int a =0,b=0,c=0,d=0;
        vector<int> v;
        for(int i= s.length()-1;i>=0;i--){
            if(i-4 >= 0){
                if(s[i] == s[i-4]){
                    continue;
                }
                
                if(s[i] == 'R'|| s[i-4] == 'R'){
                    s[i] = 'R';
                    s[i-4] = 'R'; 
                    a++;
                }else if(s[i] == 'B' || s[i-4] == 'B'){
                    s[i] = 'B';
                    s[i-4] = 'B';
                    b++;
                }else if(s[i] == 'Y' || s[i-4] == 'Y'){
                    s[i] = 'Y';
                    s[i-4] = 'Y';
                    c++;
                }else if(s[i] == 'G' || s[i-4] == 'G'){
                    s[i] = 'G';
                    s[i-4] = 'G';
                    d++;
                }
            } 
        }
        v.push_back(a);
        v.push_back(b);
        v.push_back(c);
        v.push_back(d);
        return v;
    }
};

//{ Driver Code Starts.

int main(){
    int t;
    cin>>t;
    while(t--){
        string s;
        cin>>s;
        
        Solution ob;
        vector<int> res = ob.extraCount(s);
        cout<<"R"<<res[0]<<"B"<<res[1]<<"Y"<<res[2]<<"G"<<res[3]<<"\n";
    }
    return 0;
}
// } Driver Code Ends