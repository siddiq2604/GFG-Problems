// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int r=0,s=0;
        int n1=n;
        while(n!=0){
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        return s;
    }
}