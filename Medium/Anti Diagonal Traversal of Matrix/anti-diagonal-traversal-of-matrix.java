//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            
            String input_line[] = br.readLine().trim().split("\\s+");
            int[][] matrix = new int[n][n];
            for(int i=0; i<n; i++) {
                for (int j = 0; j < n; ++j) {
                    matrix[i][j] = Integer.parseInt(input_line[i * n + j]); 
                }
            }
            Solution obj = new Solution();
            int[] ans = obj.antiDiagonalPattern(matrix);
            for(int i = 0; i < ans.length; i++)
                System.out.print(ans[i] + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int[] antiDiagonalPattern(int[][] matrix)
    {
        // Code here
        int n=matrix.length;
        int m=matrix[0].length;
        ArrayList<Integer> ans=new ArrayList<>();
        int row=0;
        int col=0;
        while(row<n && col<m){
            int i=row;
            int j=col;
            while(i<n && j>=0){
                ans.add(matrix[i][j]);
                i++;
                j--;
            }
            if(col<m-1){
                col++;
            }else{
                row++;
            }
        }
        int[] ret = new int[ans.size()];
        for (int i=0; i < ret.length; i++)
        {
            ret[i] = ans.get(i).intValue();
        }
        return ret;
    }
}