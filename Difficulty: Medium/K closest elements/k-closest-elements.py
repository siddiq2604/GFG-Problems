class Solution:
    def printKClosest(self, arr, k, x):
        # code here
        from heapq import nsmallest
        k_smallest = nsmallest(k, ((abs(x - a), -a) for a in arr if a != x))
        return [-a for _, a in k_smallest]