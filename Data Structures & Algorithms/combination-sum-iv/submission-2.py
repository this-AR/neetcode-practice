class Solution:
    def combinationSum4(self, nums: List[int], target: int) -> int:
        dp = {}

        def find(t):
            if t == 0:
                return 1

            if t < 0:
                return 0
            if(t in dp):
                return dp[t]
            ans = 0

            for num in nums:
                ans += find(t - num)

            dp[t] = ans
            return ans
        return find(target)