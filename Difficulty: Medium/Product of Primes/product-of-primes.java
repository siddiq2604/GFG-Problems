class Solution {
    public int primeProduct(int L, int R) { 
        long n=1;
        for(int i=L;i<=R;i++){
            if(f(i)){
                n=(n*i)%1000000007;
            }
        }
        return (int)n;
    }
    boolean f(long M){
        if(M<2){
            return false;
        }
        if(M==2){
            return true;
        }
        if(M%2==0){
            return false;
        }
        for(int i=3;i*i<=M;i++){
            if(M%i==0){
                return false;
            }
        }
        return true;
    }
}