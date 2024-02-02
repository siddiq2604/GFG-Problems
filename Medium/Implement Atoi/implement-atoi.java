//{ Driver Code Starts
//Initial template for JAVA

import java.util.Scanner;

class aToi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			
			Solution obj = new Solution();
			int num = obj.atoi(str);
			
			System.out.println(num);
		t--;
		}
	}
}
// } Driver Code Ends


//User function template for JAVA

/*You are required to complete this method */
class Solution
{
    int atoi(String s) {
	// Your code here
	if(s.charAt(0)=='-')
   {
       String a="";
   for(int i=1;i<s.length();i++)
   {
       if(!Character.isAlphabetic(s.charAt(i)))
       {
           a+=s.charAt(i);
       }
       else
       {
           return -1;
       }
   }
   String temp="-";
   a=temp+a;
   int temp1=Integer.parseInt(a);
   return temp1;
   }
   else
   {
       String a="";
       for(int i=0;i<s.length();i++)
       {
           if(s.charAt(i)=='-')
           {
               return -1;
           }
           if(!Character.isAlphabetic(s.charAt(i)))
           {
               a+=s.charAt(i);
           }
           
           else
           {
               return -1;
           }
       }
       int temp=Integer.parseInt(a);
       return temp;
   }
    }
}
