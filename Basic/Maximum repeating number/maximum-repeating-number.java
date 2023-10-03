//{ Driver Code Starts
//Initial Template for Java




import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().maxRepeating(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    int maxRepeating(int[] arr, int n, int k) {
        // code here
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            tm.put(arr[i], tm.getOrDefault(arr[i], 0) + 1);
        }
        int maxE = -1;
        int maxF = -1;

        for (Map.Entry<Integer, Integer> entry : tm.entrySet()) {
            int e = entry.getKey();
            int f= entry.getValue();

            if (f > maxF || (f== maxF && e< maxE)) {
                maxE = e;
                maxF = f;
            }
        }

        return maxE;
    }
}