//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends
//User function template for C++
class Solution{
public:
	
	int kSubstrConcat (int n, string s, int k)
	{
	    // Your Code Here
	    if(n%k!=0) return 0;
        unordered_map<string,int>m;
        for(int i=0;i<n;i+=k){
            m[s.substr(i,k)]++;
            if(m.size()>2) return 0;
        }
        if(m.size()<2) return 1;
        for(auto it=m.begin();it!=m.end();++it){
            if(it->second==1) return 1;
        }
        return 0;
	}
};

//{ Driver Code Starts.

int main()
{
    int t; cin >> t;
    while (t--)
	{
		int n; cin >> n;
		string s; cin >> s;
		int k; cin >> k;
        Solution  ob;
		cout << ob.kSubstrConcat (n, s, k) << endl;
	}
}
// } Driver Code Ends