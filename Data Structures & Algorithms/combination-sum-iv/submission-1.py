from functools import cache 
class Solution:
    def combinationSum4(self, nums: List[int], target: int) -> int:
        @cache
        def find(t):
            if t == 0:
                return 1

            if t < 0:
                return 0

            ans = 0

            for num in nums:
                ans += find(t - num)

            return ans

        return find(target)