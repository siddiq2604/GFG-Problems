class Solution {
    public static int nSum(int n) {
        // code here
        
        int ans = 0;
        for(int i=1;i<=n;i++){
            ans+=i;
        }
        return ans;
    }
}
