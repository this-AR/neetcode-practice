from itertools import permutations
from typing import List

class Solution:
    def permuteUnique(self, nums: List[int]) -> List[List[int]]:
        l = set()
        for p in permutations(nums):
            l.add(p)  # add the tuple, not list(p)
        return [list(p) for p in l]  # convert each tuple to a list at the end