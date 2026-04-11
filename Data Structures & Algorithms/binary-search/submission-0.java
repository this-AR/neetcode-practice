class Solution {
    public int search(int[] nums, int target) {
        int f=0,r=nums.length-1;
        while(f<=r)
        {
            int m=(f+r)/2;
            if(nums[m]==target)
            {
                return m;
            }
            else if(nums[m]>target)
            {
                r=m-1;
            }
            else 
            {
                f=m+1;
            }
        }
        return -1;
    }
}
