//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
class Solution
{
public:
    vector<long long> printSeries(int N)
    {
        // Write your code here
        vector<long long> v(N);
        for(int i=0;i<N;i++){
            if(i==0) v[i]=1;
            else if(i==1) v[i]=2;
            else if(i==2) v[i]=5;
            else v[i]=(v[i-1]+v[i-2]+v[i-3]);
        }
        return v;
    }
};

//{ Driver Code Starts.
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        int N;
        cin >> N;
        
        Solution ob;
        vector<long long> a = ob.printSeries(N);
        
        for(long long i=0;i<N;i++){
            cout<<a[i]<<" ";
        }
        cout<<endl;
        
    }
    return 0;
}
// } Driver Code Ends