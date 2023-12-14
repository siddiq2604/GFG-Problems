//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Sorting
{
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
            long arr[] = new long[(int)n];
            
            for(long i = 0; i < n; i++)
             arr[(int)i] = sc.nextLong();
             
            System.out.println(new Solution().inversionCount(arr, n));
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        return  (long)mergeSort( arr, 0,N-1) ;
    }
    static long merge(long[] arr, long low, long mid, long high) {
        ArrayList<Long> temp = new ArrayList<>(); // temporary array
        long left = low;      // starting index of left half of arr
        long right = mid + 1;   // starting index of right half of arr

        //Modification 1: cnt variable to count the pairs:
        long cnt = 0;

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr[(int)left] <= arr[(int)right]) {
                temp.add(arr[(int)left]);
                left++;
            } else {
                temp.add(arr[(int)right]);
                cnt += (mid - left + 1); //Modification 2
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[(int)left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[(int)right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (long i = low; i <= high; i++) {
            arr[(int)i] = temp.get((int)(i - low));
        }
        return cnt; // Modification 3
    }

    public static long mergeSort(long[] arr,long low, long high) {
        long cnt = 0;
        if (low >= high) return cnt;
        long mid = (low + high) / 2 ;
        cnt += mergeSort(arr, low, mid);  // left half
        cnt += mergeSort(arr, mid + 1, high); // right half
        cnt += merge(arr, low, mid, high);  // merging sorted halves
        return cnt;
    }
}