//{ Driver Code Starts
#include <iostream>
using namespace std;

// } Driver Code Ends
class Solution
{
    public:
        long long lucas(int n)
        {
            //code here.
            long long a=2,b=1,c;
            if(n<=1)
            return 2-n;
            
             for(int i=2;i<=n;i++)
             {
                 c=(a+b)%1000000007;
                 a=b;
                 b=c;
             }
             return c;
        }
        
};


//{ Driver Code Starts.
int main()
{
	int t;
	cin>>t;
	while(t--)
	{
		int n;
		cin>>n;
		Solution ob;
		cout<<ob.lucas(n)<<endl;
	}
	return 0;
}
// } Driver Code Ends