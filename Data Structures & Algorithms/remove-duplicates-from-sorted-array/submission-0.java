class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        return 0;
        int k=0;
        for(int x=1;x<=nums.length-1;x++)
        {
            if(nums[x-1]!=nums[x])
            {
                k++;
                nums[k]=nums[x];
            }
        }
        return k+1;
    }
}