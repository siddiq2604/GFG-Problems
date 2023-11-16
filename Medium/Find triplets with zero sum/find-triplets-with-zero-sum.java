//{ Driver Code Starts
import java.util.*;
class Triplets{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			int[] a=new int[n];
			for(int i=0;i<n;i++){
				a[i]=sc.nextInt();
			}
			Solution g=new Solution();
			if(g.findTriplets(a,n))
				System.out.println("1");
			else
				System.out.println("0");
			
		}
	}
}
// } Driver Code Ends


/*Complete the function below*/


class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int a[] , int n)
    {
        //add code here.
        Arrays.sort(a);
        for(int i=0;i<n-1;i++){
            int l=i+1,h=n-1;
            while(l<h){
                if(a[i]+a[l]+a[h]==0)
                    return true;
                else if(a[i]+a[l]+a[h]<0)
                    l++;
                else
                    h--;
            }
        }
        return false;
    }
}