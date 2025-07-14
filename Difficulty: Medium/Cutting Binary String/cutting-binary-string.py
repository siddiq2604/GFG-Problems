from functools import cache
dic={}
i=1
while True:
    st=bin(i).replace('0b','')
    if len(st)>30:
        break
    dic[st]=1
    i*=5
class Solution:
    def cuts(self, s):
        n=len(s)
        dp=[float('inf') for _ in range(n+1)]
        dp[n]=0
        for i in range(n-1,-1,-1):
            for j in range(i+1,n+1):
                if s[i:j] in dic:
                    dp[i]=min(dp[i],dp[j]+1)
        return dp[0] if dp[0]!=float('inf') else -1
        