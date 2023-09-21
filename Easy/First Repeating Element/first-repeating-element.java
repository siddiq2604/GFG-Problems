//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GFG {
    public static void main(String[] args) {

        // Taking input using class Scanner
        Scanner sc = new Scanner(System.in);

        // Taking total count of testcases
        int t = sc.nextInt();

        while (t-- > 0) {
            // taking total count of elements
            int n = sc.nextInt();

            // creating a new array of size n
            int arr[] = new int[n];

            // inserting elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Solution ob = new Solution();
            // calling firstRepeated method
            // and printing the result
            System.out.println(ob.firstRepeated(arr, n));
        }
    }
}
// } Driver Code Ends

// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
        HashMap<Integer, Integer> fO = new HashMap<>();
        int minIndex = n + 1;
        int ele = -1;
        for (int i = 0; i < n; i++) {
            if (fO.containsKey(arr[i])) {
                if (fO.get(arr[i]) < minIndex) {
                    minIndex = fO.get(arr[i]);
                    ele = arr[i];
                }
            } else {
                fO.put(arr[i], i + 1); 
            }
        }
        if (minIndex == n + 1) {
            return -1;
        } else {
            return minIndex;
        }
    }
}
