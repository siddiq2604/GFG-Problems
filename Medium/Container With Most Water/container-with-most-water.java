//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
import java.lang.*;


class GFG {
	public static void main (String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim()); //Inputting the testcases
		while(t-->0){
		    int n = Integer.parseInt(br.readLine()); // input size of array
		    int arr[] = new int[n];
		    String inputLine[] = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; i++){
		        arr[i] = Integer.parseInt(inputLine[i]); // input elements of array
		    }
		    Solve T = new Solve();
            long ans = T.maxArea(arr,n);
            System.out.println(ans);
		}
	}
}

// } Driver Code Ends


//User function Template for Java


class Solve{
    
    long maxArea(int A[], int len){
        // Code Here
        int maxArea=0;
        int lp=0;
        int rp=len-1;
        while(lp<rp){
            int ht=Math.min(A[lp],A[rp]);
            int width=rp-lp;
            int currWater=ht*width;
            maxArea=Math.max(maxArea,currWater);
            if(A[lp]<A[rp]){
             lp++;   
            }
            else{
                rp--;
            }
        }
        return maxArea;
    }
    
}