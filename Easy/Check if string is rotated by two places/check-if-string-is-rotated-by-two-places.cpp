//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    bool isRotated(string s1, string s2)
    {
        // Your code here
        int n1=s1.size(),n2=s2.size();
        if(n1!=n1)return 0;
        if(n1<=2)
            return s1==s2;
        string c="",ac="";
        ac=s1.substr(2)+s1.substr(0,2);
        c=s1.substr(n1-2,2)+s1.substr(0,n1-2);
        return (ac==s2||c==s2);
    }

};


//{ Driver Code Starts.

int main() {
	
	int t;
	cin>>t;
	while(t--)
	{
		string s;
		string b;
		cin>>s>>b;
		Solution obj;
		cout<<obj.isRotated(s,b)<<endl;
	}
	return 0;
}

// } Driver Code Ends