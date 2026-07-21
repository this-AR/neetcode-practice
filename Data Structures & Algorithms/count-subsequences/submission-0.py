from functools import cache
class Solution:
    def numDistinct(self, s: str, t: str) -> int:

        @cache
        def find(i, j):
            if j == len(t):
                return 1

            if i == len(s):
                return 0

            if s[i] == t[j]:
                return find(i + 1, j + 1) + find(i + 1, j)

            return find(i + 1, j)

        return find(0, 0)