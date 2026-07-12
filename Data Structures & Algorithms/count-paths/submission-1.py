from functools import cache

class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        return self.find(m, n, 0, 0)

    @cache
    def find(self, m, n, i, j):
        if i == m - 1 and j == n - 1:
            return 1

        if i == m or j == n:
            return 0

        return self.find(m, n, i + 1, j) + self.find(m, n, i, j + 1)