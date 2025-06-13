#User function Template for python3

class Solution:
    def kokoEat(self,arr,k):
        # Code here\
        lo, hi = 1, max(arr)
        while lo < hi:
            mid = lo + (hi - lo) // 2
            hours = sum((a + mid - 1) // mid for a in arr)
            if hours > k:
                lo = mid + 1
            else:
                hi = mid
        return lo