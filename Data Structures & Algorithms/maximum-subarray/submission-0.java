class Solution {
    public int maxSubArray(int[] nums) {
        
        int max=0,m=Integer.MIN_VALUE;
        int cur=0;
        for(int x=0;x<nums.length;x++)
        {
            if(m<nums[x])
            m=nums[x];
            cur+=nums[x];
            if(cur<0)
            {
                cur=0;
                continue;
            }
            
            if(cur>max)
            max=cur;
        }
        return m>0?max:m;
        
    }
}
