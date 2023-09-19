//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class GFG
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
               arr[i] = sc.nextInt();
              
            Geeks obj = new Geeks();
            obj.SumArray(arr, n);
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// arr is the array
// n is the number of element in array
class Geeks
{
    public static void SumArray(int arr[], int n)
    {
        // your code here
        int sum=0;
        int result=0;
        for(int i=0;i<n;i++){
        sum=sum+arr[i];
        }
        for(int i=0;i<n;i++){
            result=sum-arr[i];
            System.out.print(result+" ");
        }
    }
}
