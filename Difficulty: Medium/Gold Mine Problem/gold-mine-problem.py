class Solution:
    def maxGold(self, mat):
        # code here
        n, m = len(mat), len(mat[0])
        if n == 1:
            return sum(mat[0])
        for col in range(1, m):
            mat[0][col] += max(mat[0][col - 1], mat[1][col - 1])
            for row in range(1, n - 1):
                mat[row][col] += max(mat[row - 1][col - 1], mat[row][col - 1], mat[row + 1][col - 1])
            mat[-1][col] += max(mat[-1][col - 1], mat[-2][col - 1])
        return max(mat[row][-1] for row in range(n))