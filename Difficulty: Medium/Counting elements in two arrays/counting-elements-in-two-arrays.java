class Solution {
    static int binarySearch(int [] arr, int target, int start, int end){
        // int start = 0, end = arr.length-1;
        
        while (start <= end){
            int mid = (end - start)/2 + start;
            if (arr[mid] == target)
                return binarySearch(arr, target, mid+1, end);
            else if (arr[mid] < target)
                start = mid+1;
            else
                end = mid-1;
        }
        return end;
        
    }
    
    public static ArrayList<Integer> countLessEq(int a[], int b[]) {
        // code here
        Arrays.sort(b);
        
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++){
            int tmp = binarySearch(b, a[i], 0, b.length-1);
            ans.add(tmp < 0 ? 0 : tmp+1);
        }
        return ans;
    }
}