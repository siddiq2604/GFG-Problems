class Solution {
    public boolean isPalindrome(int n) {
        // code here
        int r = 0;
        int n1 = n;
        while(n1>0){
            int s = n1%10;
            r = r*10+s;
            n1 = n1/10;
        }
        if(r==n){
            return true;
        }
        else{
            return false;
        }
    }
}