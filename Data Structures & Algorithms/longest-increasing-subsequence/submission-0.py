
from functools import cache
class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        if len(nums)<=1:
            return len(nums)
        
        @cache
        def find(i,prev):
            if(i==len(nums)):
                return 0

            take=0
            nottake=0
            if(nums[i]>prev):
                take=1+find(i+1,nums[i])

            nottake=find(i+1,prev)
            return max(take,nottake)       

        return find(0,-1001) 