//{ Driver Code Starts
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
            String s = br.readLine().trim();
            int n = Integer.parseInt(s);
            String S = br.readLine();
            String[] s1 = S.split(" ");
            List<Integer> a = new ArrayList<Integer>(); 
            for( int i = 0; i < n; i++)
            {
                a.add(Integer.parseInt(s1[i]));
            }
            Solution ob = new Solution();
            int ans = ob.findPeakElement(a);
            System.out.println(ans);

        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int findPeakElement(List<Integer> a)
    {
        // Code here
        int t=0;
        for(int i=0; i<a.size()-1; i++){
            if(t<a.get(i)){
                t = a.get(i);
            }
        }
        return t;
    }
}