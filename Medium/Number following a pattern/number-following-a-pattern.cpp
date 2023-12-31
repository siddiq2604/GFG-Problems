//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution{   
public:
    string printMinNumberForPattern(string s){
        // code here 
        string ans;
        int cnt=0,k=0;
        for(int i=0;i<=s.size();i++){
            if(s[i]=='I' || i==s.size()){
                int temp=cnt+1+k;
                while(temp>k)  ans+=char(temp--+'0');
                k+=cnt+1;cnt=0;
            }else cnt++;
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
        string S;
        cin >> S;
        Solution ob;
        cout << ob.printMinNumberForPattern(S) << endl;
    }
    return 0; 
} 

// } Driver Code Ends