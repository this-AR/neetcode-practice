class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return find(nums,target,0,0);
    }
    int find(int[] nums, int target,int cur,int i)
    {
        if(nums.length==i &&  cur==target )
        {
            return 1;
        }

        if(nums.length==i)
        return 0;
        return find(nums,target,cur+nums[i],i+1)+find(nums,target,cur-nums[i],i+1);
    }
}
