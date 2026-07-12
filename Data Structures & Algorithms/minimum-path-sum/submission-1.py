from functools import cache

class Solution:
    def minPathSum(self, grid: list[list[int]]) -> int:
        m, n = len(grid), len(grid[0])

        @cache
        def dfs(i, j):
            if i == m or j == n:
                return float('inf')

            if i == m - 1 and j == n - 1:
                return grid[i][j]

            return grid[i][j] + min(dfs(i + 1, j), dfs(i, j + 1))

        return dfs(0, 0)