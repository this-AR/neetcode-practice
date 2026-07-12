from functools import cache

class Solution:
    def findTargetSumWays(self, nums: list[int], target: int) -> int:

        @cache
        def dfs(i, curr_sum):
            if i == len(nums):
                return 1 if curr_sum == target else 0

            add = dfs(i + 1, curr_sum + nums[i])
            subtract = dfs(i + 1, curr_sum - nums[i])

            return add + subtract

        return dfs(0, 0)