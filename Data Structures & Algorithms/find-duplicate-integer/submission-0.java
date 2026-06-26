class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int r=-1;
        for(int x=0;x<nums.length-1;x++)
        {
            if(nums[x]==nums[x+1])
            r= nums[x];
        }
        return r;
    }
}
