class Solution {
    public int majorityElement(int[] nums) {
        int c=0;
        int e=nums[0];
        for(int x:nums)
        {
            if(x==e)
            {
                c++;
            }
            else 
            {
                if(c==0)
                {
                    e=x;
                
                }
                else 
                {
                    c--;
                }
                
            }
        }
        return e;
        
    }
}