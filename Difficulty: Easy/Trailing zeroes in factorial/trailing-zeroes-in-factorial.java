class Solution {
    static int trailingZeroes(int n) {
        // code here
        int r=0;
        for(int i=5;i<=n;i=i*5){
            r=r+n/i;
        }
        return r;
    }
}