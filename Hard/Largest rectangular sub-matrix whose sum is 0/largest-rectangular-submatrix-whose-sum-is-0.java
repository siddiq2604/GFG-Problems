//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] nm = IntArray.input(br, 2);
            
            
            int[][] a = IntMatrix.input(br, nm[0], nm[1]);
            
            Solution obj = new Solution();
            ArrayList<ArrayList<Integer>> res = obj.sumZeroMatrix(a);
            
            if(res.size() == 0) {
                System.out.println(-1);
                
            } else {
            
                IntMatrix.print(res);
            }        
        }
    }
}

// } Driver Code Ends



class Solution {
    public static ArrayList<ArrayList<Integer>> sumZeroMatrix(int[][] b) {
        // code here
        int m = b.length;
        int n = b[0].length;
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int startRow = -1, endRow = -1, startCol = -1, endCol = -1;
        int maxSize = 0;
        for (int l = 0; l < n; l++) {
            int[] rowSum = new int[m];
            for (int r = l; r < n; r++) {
                for (int i = 0; i < m; i++) {
                    rowSum[i] += b[i][r];
                }
                int sum = 0;
                HashMap<Integer, Integer> map = new HashMap<>();
                map.put(0, -1);
                for (int i = 0; i < m; i++) {
                    sum += rowSum[i];
                    if (map.containsKey(sum)) {
                        int currentSize = (r - l + 1) * (i - map.get(sum));
                        if (currentSize > maxSize) {
                            maxSize = currentSize;
                            startRow = map.get(sum) + 1;
                            endRow = i;
                            startCol = l;
                            endCol = r;
                        }
                    } else {
                        map.put(sum, i);
                    }
                }
            }
        }
        if (maxSize == 0) {
            return ans;
        }
        for (int i = startRow; i <= endRow; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = startCol; j <= endCol; j++) {
                row.add(b[i][j]);
            }
            ans.add(row);
        }
        return ans;
    }
}
        
