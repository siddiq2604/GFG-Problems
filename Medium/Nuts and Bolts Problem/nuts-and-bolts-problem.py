#User function Template for python3
class Solution:

	def matchPairs(self, n, nuts, bolts):
		# code here
		c=['!','#','$','%','&','*','?','@','^']
        k=[]
        for i in c:
            if(i in nuts):
                k.append(i)
                
        nuts.clear()  
        bolts.clear()
        nuts[:]= k
        bolts[:]= k

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    tc = int(input())
    while tc > 0:
        n = int(input())
        nuts = list(map(str, input().strip().split()))
        bolts = list(map(str, input().strip().split()))
        ob = Solution()
        ob.matchPairs(n, nuts, bolts)
        for x in nuts:
            print(x, end=" ")
        print()
        for x in bolts:
            print(x, end=" ")
        print()
        tc -= 1

# } Driver Code Ends