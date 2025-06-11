class Solution {
    public int findLength(int[] color, int[] radius) {
        // code here
        
        //STEP-1: Declare a Stack to keep track of prev index
        Stack<Integer> st = new Stack();
        
        //STEP-2: Traverse both arrays simultaneously
        for(int i=0;i<color.length;i++){
        
  //Check 1: If Stack not empty --> Check if elements at last index(st.top) are same or not              
            if(!st.isEmpty() && (color[i] == color[st.peek()] && radius[i] == radius[st.peek()])){
                
                // pop the top of stack
                st.pop();
            
                
            }else{
            
                //Check 2: If Stack is empty --> Directly push index i    
                st.push(i);
                
            }
            
        }
        
        //return stack size
        return st.size();
    }
}