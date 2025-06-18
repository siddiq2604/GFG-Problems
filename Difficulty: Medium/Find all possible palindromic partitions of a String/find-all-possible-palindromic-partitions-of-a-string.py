class Solution:
    def palinParts (self, s):
        # code here
        n = len(s)
        dp = [[False]*n for _ in range(n)]
        
        for i in range(n-1, -1, -1):
            for j in range(i, n):
                if s[i] == s[j]:
                    if i+1 >= j-1:
                        dp[i][j] = True
                    else:
                        dp[i][j] = dp[i+1][j-1]
        ans = []
        
        def dfs(sofar, i):
            nonlocal s, n
            if i >= len(s):
                ans.append(sofar[:])
                return
            
            for j in range(i, n):
                if dp[i][j]:
                    sofar.append(s[i:j+1])
                    dfs(sofar, j+1)
                    sofar.pop()
        
        dfs([], 0)
        return ans

