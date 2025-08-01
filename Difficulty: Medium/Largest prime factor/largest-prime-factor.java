// User function Template for Java

class Solution {
    static int largestPrimeFactor(int N) {
        // code here
        int maxp=Integer.MIN_VALUE;
        while(N%2==0){
                N=N/2;
                maxp=2;
        }
        for(int i=3;i*i<=N;i+=2){
            while(N%i==0){
                N=N/i;
                maxp=i;
                
            }
        }
        if(N>2){
            return maxp=N;
        }
        return maxp;
    }
}