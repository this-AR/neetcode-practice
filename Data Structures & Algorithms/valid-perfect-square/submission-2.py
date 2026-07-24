from math import isqrt

class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        x = isqrt(num)
        return x * x == num