class Solution:
    def minimumCoins(self, arr, k):
        # code here
        from itertools import accumulate
        from bisect import bisect_left, bisect_right
        
        arr.sort()
        
        prefix_sum = list(accumulate(arr, initial=0))
        
        # we have to search each height from 0, arr[-1] and keep the minimum cost

        n = len(arr)
        ans = float('inf')
        for h in range(0, arr[-1]+1):
            i = bisect_left(arr, h) # i elements whose height < h
            cost1 = prefix_sum[i]
            j = bisect_right(arr, h+k) # n-j elements who height >  h+k
            
            diff = prefix_sum[-1] - prefix_sum[j] 
            cost2 = diff - (n-j)*(h+k)
            #print(f"h = {h}, i = {i}, j = {j}, cost1 = {cost1}, cost2 = {cost2}")
            ans = min(ans, cost1+cost2)
        
        return ans