class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int  n  = arr.length;
        int l = 0 , r = n - 1;
        while(l<r){
            int t = arr[l];
            arr[l] = arr[r];
            arr[r] = t;
            l++;
            r--;
        }
        
        return arr;
    }
}