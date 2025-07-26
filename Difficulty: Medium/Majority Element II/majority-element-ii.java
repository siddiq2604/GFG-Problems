class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
        int tot = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer,Integer> mp = new TreeMap<>();
        
        for(int n:arr){
            mp.put(n,mp.getOrDefault(n,0)+1);
        }
        
        for(int k:mp.keySet()){
            if(tot/3 < mp.get(k)) ans.add(k);
        }
        
        return ans;
    }
}