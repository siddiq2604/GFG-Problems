class Solution {
    public int sumSubMins(int[] arr) {
        // code here
        int n = arr.length;
        int mod = (int)1e9 + 7;
        
        int[] prevSmaller = new int[n];
        int[] nextSmaller = new int[n];
        Stack<Integer> stack = new Stack<>();
        
        // Previous Smaller Element Distance
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            prevSmaller[i] = stack.isEmpty() ? i + 1 : i - stack.peek();
            stack.push(i);
        }
        
        stack.clear();
        
        // Next Smaller Element Distance
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            nextSmaller[i] = stack.isEmpty() ? n - i : stack.peek() - i;
            stack.push(i);
        }

        // Calculate the sum of contributions
        long sum = 0;
        for (int i = 0; i < n; i++) {
            long contrib = (long) arr[i] * prevSmaller[i] * nextSmaller[i];
            sum = (sum + contrib) % mod;
        }

        return (int) sum;
    }
}
