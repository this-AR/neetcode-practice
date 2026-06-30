class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        return self.h(nums, 0, [])

    def h(self, nums, n, l):
        if n == len(nums):
            return [l]

        include = self.h(nums, n + 1, l + [nums[n]])
        exclude = self.h(nums, n + 1, l)

        return include + exclude