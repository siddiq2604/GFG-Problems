//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 


// } Driver Code Ends
//User function Template for Java

class Solution 
{ 
    static int catchThieves(char arr[], int n, int k) 
	{ 
        // Code here
        int res = 0;
        ArrayList<Integer> pol = new ArrayList<Integer>();
        ArrayList<Integer> the = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P')
                pol.add(i);
            else if (arr[i] == 'T')
                the.add(i);
        }
        int l = 0, r = 0;
        while (l < the.size() && r < pol.size()) {
            if (Math.abs(the.get(l) - pol.get(r)) <= k) {
                res++; 
                l++;   
                r++;   
            } else if (the.get(l) < pol.get(r)) {
                l++;   
            } else {
                r++;  
            }
        }
        return res;
	} 
} 



//{ Driver Code Starts.
class GFG{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
			char arr[] = new char[n];
			for(int i=0; i<n; i++)
         		arr[i] = sc.next().charAt(0);

			Solution ob = new Solution();
            System.out.println(ob.catchThieves(arr, n, k));
            t--;
        }
    }
}       
// } Driver Code Ends