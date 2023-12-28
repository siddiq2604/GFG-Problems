//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
// User function template for C++
class Solution{
    public:
    bool solve(string wild, string pattern, int i , int j){
      //  cout<<i<<" "<<j<<" "<<wild.length()<<" "<<pattern.length()<<endl;
        if(i==wild.length() && j == pattern.length()){
            return true;
        }
        if(i== wild.length()){
            return false;
        }
        if(j==pattern.length()){
            return false;
        }
        
        
        if((wild[i]==pattern[j]) || wild[i] == '?'){
            i++;
            j++;
            return solve(wild,pattern,i,j);
        }
        else if(wild[i] == '*'){
            if(i == wild.length()-1){
                return true;
            }
            i++;
            
            for(int k = 0; k+j< pattern.length();k++){
                if(wild[i] == pattern[k+j] || wild[i] == '?'){
                    if(solve(wild,pattern,i+1,k+j+1)){
                        return true;
                    }
                } 
                if(wild[i] == '*'){
                    if(solve(wild,pattern,i+1,k+j)){
                        return true;
                    }
                }
            }
            return false;
        }
    }
    bool match(string wild, string pattern)
    {
        // code here
        return solve(wild,pattern,0,0);
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin>>t;
    while(t-->0)
    {
        string wild, pattern;
        cin>>wild>>pattern;
        
        Solution ob;
        bool x=ob.match(wild, pattern);
        if(x)
        cout<<"Yes\n";
        else
        cout<<"No\n";
    }
    return 0;
}
// } Driver Code Ends