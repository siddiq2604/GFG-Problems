class Solution:
    def largestSubset(self, arr):
        #code here
        if not arr:
          return []
        
        arr.sort()
        n = len(arr)
        dp = [[num] for num in arr ]
        
        for i in range(n):
           for j in range(i):
             if arr[i] % arr[j] == 0:
                if len(dp[j])  + 1 > len(dp[i]):
                    dp [i] = dp[j] + [arr[i]]
                elif len(dp[j]) + 1 == len(dp[i]):
                     candidate = dp[j] + [arr[i]]
                     if candidate > dp[i]:
                        dp[i] = candidate
        
        max_len = max(len(sub) for sub in dp)
        candidate = [sub for sub in dp if len(sub) == max_len]
        return max(candidate)