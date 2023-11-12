//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    bool isRotated(string str1, string str2)
    {
        // Your code here
        int flag1=0,flag2=0;
        string temp=str2+str2;
        int st=str1.size()-2;
        string s1(temp.begin()+st,temp.begin()+2*st+2);
        if(str1==s1) flag1=1;
        string s2(temp.begin()+2,temp.begin()+2+str1.size());
        if(str1==s2) flag2=1;
        if(flag1 || flag2) return 1;
        return 0;
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