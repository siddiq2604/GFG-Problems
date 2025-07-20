class Solution {
  public:
    int countValid(int n, vector<int>& arr) {
        // code here
        long total = 9*(long) pow(10, n-1);
        
        unordered_map<int, bool> um;
        for(auto z: arr){
            um[z]=true;
        }
        
        int noInclude = 10 - um.size();
        long noIncTotal;
        if(um.find(0)==um.end())
            noIncTotal = (long)(noInclude-1)*(long) pow(noInclude, n-1);
        else
            noIncTotal = (long)(noInclude)*(long) pow(noInclude, n-1);
        long ans  =  total - noIncTotal;
        
        return int(ans);
    }
};
