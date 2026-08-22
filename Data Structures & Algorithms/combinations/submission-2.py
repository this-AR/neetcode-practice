from itertools import combinations
class Solution:
    def combine(self, n: int, k: int) -> List[List[int]]:
        l=list(range(1,n+1))
        res=[]
        for c in combinations(l, k):
            res.append(list(c))
        return res
        