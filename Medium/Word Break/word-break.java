//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
public class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    int n;
                    n = sc.nextInt();
                    ArrayList<String> dictionary = new ArrayList<String>();
                    for(int i = 0;i<n;i++)
                        {
                            String p = sc.next();
                            dictionary.add(p);
                        }
                    String s = sc.next();
                    Solution obj = new Solution();  
                    System.out.println(obj.wordBreak(n, s, dictionary));  
                    
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
     public static boolean memo(int i,String s,ArrayList<String> dict,Boolean dp[]){
        if(i==s.length()) return true;
        if(dp[i]!=null) return dp[i];
        for(int j=i+1;j<=s.length();j++){
            String sub=s.substring(i,j);
            if(dict.contains(sub) && memo(j,s,dict,dp)) return dp[i]=true;
        }
        return dp[i]=false;
    }
    public static int wordBreak(int n, String s, ArrayList<String> dictionary )
    {
        //code here
        return memo(0,s,dictionary,new Boolean[s.length()+1])?1:0;
    }
}