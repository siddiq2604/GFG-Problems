//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(in.readLine());
        while (T-- > 0) {
            String s[] = in.readLine().trim().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int a[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                s = in.readLine().trim().split(" ");
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(s[j]);
                }
            }
            Solution ob = new Solution();
            out.println(ob.numberOfEnclaves(a));
        }
        out.close();
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    void dfs(int[][] grid , int [][]vis , int row , int col , int[] drow , int []dcol){
        int n = grid.length;
        int m = grid[0].length;
        
        vis[row][col] = 1;
        for(int i = 0 ; i < 4 ; i++){
            int nr = row + drow[i];
            int nc = col + dcol[i] ;
            if(nr >= 0 && nc >= 0 && nr < n && nc < m && vis[nr][nc] == 0 && grid[row][col] == 1){
                dfs(grid,vis,nr,nc,drow,dcol);
            }
        }
    }

    int numberOfEnclaves(int[][] grid) {

        // Your code here
        int cnt = 0;
        int n = grid.length;
        int m = grid[0].length;
        int drow[] = {1,-1,0,0}; 
        int dcol[] = {0,0,1,-1}; 
        int [][]vis = new int[n][m];
        
        for(int i = 0 ; i < m ; i++){
            if(vis[0][i] == 0 && grid[0][i] == 1){
                dfs(grid,vis,0,i,drow,dcol);
            }
            if(vis[n-1][i] == 0 && grid[n-1][i] == 1){
                dfs(grid,vis,n-1,i,drow,dcol);
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(vis[i][0] == 0 && grid[i][0] == 1){
                dfs(grid,vis,i,0,drow,dcol);
            }
            if(vis[i][m-1] == 0 && grid[i][m-1] == 1){
                dfs(grid,vis,i,m-1,drow,dcol);
            }
        }
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < m ; j++){
                if(vis[i][j] == 0 && grid[i][j] == 1)cnt++;
            }
        }
        return cnt;
    }
}

