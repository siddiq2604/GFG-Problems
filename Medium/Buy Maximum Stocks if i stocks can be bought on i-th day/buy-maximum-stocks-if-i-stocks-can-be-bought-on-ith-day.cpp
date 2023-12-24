//{ Driver Code Starts
/* Driver program to test above function */

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution {
public:
    int buyMaximumProducts(int n, int k, int price[]){
        //Write your code here
        vector<pair<int,int>>v;
        int c=0;
        for(int i=0;i<n;i++){
            v.push_back({price[i],i+1});
        }
        sort(v.begin(),v.end());
        for(auto i:v){
            int p=i.first*i.second;
            if(p<=k){
                c+=i.second;
                k-=p;
            }
            else {
                int t=i.second;
                t--;
                p=i.first*t;
                while(p>k&&t>0){
                    t--;
                    p=i.first*t;
                }
                if(t>0){
                    c+=t;
                    k-=p;
                }
                else break;
            }
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
	    int n, k;
	    cin >> n >> k;
	    int price[n];
	    for(int i = 0 ; i < n; i++){
	        cin >> price[i];
	    }
	    Solution ob;
	    int ans = ob.buyMaximumProducts(n, k, price);
	    cout << ans<<endl;
	}
	return 0;
}

// } Driver Code Ends