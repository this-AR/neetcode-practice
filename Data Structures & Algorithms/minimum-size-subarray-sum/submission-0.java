class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l1=nums.length;
        int min=l1+1,l=0,r=0;
        int s=0;
        while(r<l1)
        {
            s+=nums[r];
            if(s>=target){
            min=Math.min(min,r-l+1);
            while(l<=r && s>=target)
            {
                s-=nums[l];
                l++;
                if(s>=target){
                min=Math.min(min,r-l+1);
            }
            }
            }
            r++;
            
        }
        if(min==l1+1)
        return 0;
        return min;
    }
}