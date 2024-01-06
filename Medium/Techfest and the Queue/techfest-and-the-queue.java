//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            long a;
            a = Long.parseLong(br.readLine().trim());
            
            
            long b;
            b = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            long res = obj.sumOfPowers(a, b);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends



class Solution {
    public static long sumOfPowers(long a, long b) {
        // code here
        Map<Long, Integer> memo = new HashMap<>();
        long result = 0;
        for (long x = a; x <= b; x++) {
            result += calculateSumOfPowers(x, memo);
        }
        return result;
    }
    private static long calculateSumOfPowers(long x, Map<Long, Integer> memo) {
        if (memo.containsKey(x)) {
            return memo.get(x);
        }

        long num = x;
        long count = 0;
        while (num % 2 == 0) {
            num /= 2;
            count++;
        }
        for (long i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                num /= i;
                count++;
            }
        }
        if (num > 2) {
            count++;
        }
        memo.put(x, (int) count);

        return count;
    }
}
        
