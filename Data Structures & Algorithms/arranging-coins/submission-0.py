from math import isqrt

class Solution:
    def arrangeCoins(self, n: int) -> int:
        return (isqrt(8 * n + 1) - 1) // 2