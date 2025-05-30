class Solution {
    public int kthSmallest(int[][] m, int k) {
        // code here
        ArrayList<Integer>arr=new ArrayList<>();
        for(int i=0;i<m[0].length;i++){
            
            for(int j=0;j<m.length;j++){
               
              
                arr.add(m[j][i]);
            }
           
        }
        if(arr.size()<k)return -1;
        
        Collections.sort(arr);
        return arr.get(k-1);
    }
}