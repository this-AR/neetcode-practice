from functools import cache

class Solution:
    def uniquePathsWithObstacles(self, obstacleGrid: list[list[int]]) -> int:
        m, n = len(obstacleGrid), len(obstacleGrid[0])

        @cache
        def dfs(i, j):
            if i == m or j == n:
                return 0

            if obstacleGrid[i][j] == 1:
                return 0

            if i == m - 1 and j == n - 1:
                return 1

            return dfs(i + 1, j) + dfs(i, j + 1)

        return dfs(0, 0)