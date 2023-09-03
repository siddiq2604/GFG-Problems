//{ Driver Code Starts

#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends

class Solution {
  public:
    int sums(int m){
        int s=0;
        while(m){
            s+=m%10;
            m/=10;
        }
        return s; 
    }
    int sumPrimeFact(int m){
        int s=0;
        while(m%2==0){
            s+=2;
            m/=2;
        }
        for(int i=3;i*i<=m;i++){
            while(m%i==0){
                s+=sums(i);
                m/=i;
            }
        }
        if(m>1){
            s+=sums(m);
        }
        return s;
    }
    bool isPrime(int n) {
        if (n<=1)
            return false;

        if (n==2 || n==3)
            return true;

        if (n%2==0 || n%3==0)
            return false;

        for (int i=5; i*i<=n; i+= 6) {
            if (n%i==0 || n%(i+2)==0)
                return false;
        }

        return true;
    }
    
    int smithNum(int n) {
        // code here
        if(isPrime(n))
        return 0;
        
        return sums(n)==sumPrimeFact(n);
        
    }
};

//{ Driver Code Starts.
int main() {
    int t;
    cin >> t;
    while (t--) {
        int n;
        
        cin>>n;

        Solution ob;
        cout << ob.smithNum(n) << endl;
    }
    return 0;
}
// } Driver Code Ends