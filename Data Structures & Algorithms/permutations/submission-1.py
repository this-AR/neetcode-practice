from itertools import permutations
class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        l=[]
        for p in permutations(nums):
            l.append(list(p))
        return l
            
        