//{ Driver Code Starts
import java.util.*;

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long n) {
        // code here
        char []arr1 = {'1','2','3','4','5','6','7','8','9'};
        String N = Long.toString(n);
        String fasc = n +""+ (n*2) +""+ (n*3);
        char[] ch = fasc.toCharArray();
        Arrays.sort(ch);
        if(Arrays.equals(ch,arr1)){
        return true;
        }
        return false;
    }
}