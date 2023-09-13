//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Compute obj = new Compute();
            System.out.println(obj.countOfElements(a, n, k));
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java


class Compute {
    
    public long countOfElements(long arr[], long n, long x)
    {
        long c=0;
        for(int i=0;i<n;i++){
            if(arr[i]<=x){
                c++;
            }
        }
        return c;
    }
}