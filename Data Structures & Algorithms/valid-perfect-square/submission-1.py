from math import sqrt,isqrt
class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        return sqrt(num)*isqrt(num)==num
        