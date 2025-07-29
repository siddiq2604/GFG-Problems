class Solution {
    public static int gcd(int a, int b) {
        // code here
        if(b==0){
            return a;
        } 
        else {
            return gcd(b,a%b);
        }
    }
}
