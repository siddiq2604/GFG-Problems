//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
        vector <int> search(string pat, string txt)
        {
            //code here
            vector<int> ans;
            int i=0;
            int j=0;
            while(i<txt.size())
            {
                if(txt[i]==pat[j])
                {   
                    
                    int last=i;
                    while(txt[i]==pat[j] && j<pat.length() && i<txt.size())
                    {   
                        i++;
                        j++;
                    }
                    
                    if(j==pat.length())
                    {
                        ans.push_back(last+1);
                        j=0;
                        i=last+1;
                    }
                    else
                    {
                        j=0;
                        i=last+1;
                    }
                }
                else
                {
                    i++;
                }
                
            }
            if(ans.size()==0)
                ans.push_back(-1);
            return ans;
        }
     
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string S, pat;
        cin >> S >> pat;
        Solution ob;
        vector <int> res = ob.search(pat, S);
        if (res.size()==0)
            cout<<-1<<endl;
        else {
            for (int i : res) cout << i << " ";
            cout << endl;
        }
    }
    return 0;
}

// Contributed By: Pranay Bansal

// } Driver Code Ends