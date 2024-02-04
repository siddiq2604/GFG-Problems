//{ Driver Code Starts
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);

            int start[] = new int[n];
            int end[] = new int[n];

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++)
                start[i] = Integer.parseInt(inputLine[i]);

            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) 
                end[i] = Integer.parseInt(inputLine[i]);
                
            int ans = new Solution().maxMeetings(start, end, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends

class Solution 
{
    //Function to find the maximum number of meetings that can
    //be performed in a meeting room.
    static class Meetings{
        int start;
        int end;
        public Meetings(int start, int end){
            this.start = start;
            this.end = end;
        }
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        // add your code here
        Meetings[] meet = new Meetings[n];
        for(int i = 0;i<n;i++){
            meet[i] = new Meetings(start[i],end[i]);
        }
        Arrays.sort(meet,(a,b)->a.end-b.end);
        int cnt = 1;
        int endTime = meet[0].end;
        for(int i = 0;i<n;i++){
            if(meet[i].start > endTime){
                cnt++;
                endTime = meet[i].end;
            }
        }
        return cnt;
    }
}
