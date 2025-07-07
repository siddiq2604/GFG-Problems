class Solution {
  public:
    vector<int> nextLargerElement(vector<int> &arr) {
        // code here
        int n =arr.size();
              stack<int>st;
               for(int i=n-1;i>=0;i--) st.push(arr[i]);
             
             for(int i=n-1;i>=0;i--){
                  
                         int num =arr[i];
                         
                       
                         
                         while (!st.empty() && st.top()<=num){
                              st.pop();
                         }
                         
                         
                         if (!st.empty()){
                              arr[i]=st.top();
                         }
                         else{
                               arr[i]=-1;
                         }
                         
                           st.push(num);
                         
                         
                         
                     
             }
             
             return arr;
    }
};