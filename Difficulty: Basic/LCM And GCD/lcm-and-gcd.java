class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int r = Math.min(a,b);
        while(r>0){
            if(a%r==0 && b%r==0){
                break;
            }
            r--;
        }
        int lcm = a*b/r;
        return new int[]{lcm,r};
    }
}