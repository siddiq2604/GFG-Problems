//{ Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

// } Driver Code Ends
//User function Template for C++
class Solution
{
public:
    int NthTermOfSeries(int N)
    {
        // Write Your Code here
        vector<int> v;
        v.push_back(4);
        v.push_back(7);
        int i=0;
        while(i<N/2){
            v.push_back(v.at(i)*10+4);
            v.push_back(v.at(i)*10+7);
            i++;
        }
        return v.at(N-1);
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
        cin>>N;
        Solution ob;
        int ans  = ob.NthTermOfSeries(N);
        cout<<ans<<endl;
    }
    return 0;
}
// } Driver Code Ends