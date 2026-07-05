class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+2];
        dp[n]=0;
        dp[n+1]=0;
        for(int x=n-1;x>=0;x--)
        {
            dp[x]=Math.max(dp[x+2]+nums[x],dp[x+1]);
        }
        return dp[0];

        
    }
}
