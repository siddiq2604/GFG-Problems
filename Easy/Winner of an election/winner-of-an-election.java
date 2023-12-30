//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Solution obj = new Solution();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to return the name of candidate that received maximum votes.
    public static String[] winner(String arr[], int n)
    {
        // add your code
        TreeMap<String,Integer> map=new TreeMap<>();                              
        for(String s:arr)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String ans="";
        int max=Integer.MIN_VALUE;
        for(String s:map.keySet())
        {
            int t=map.get(s);
            if(t>max)
            {
                max=t;
                ans=s;
            }
        }
        String res[]={ans,String.valueOf(max)};
        return res;
    }
}

