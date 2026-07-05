class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int sum=c(0,nums,dp);
        return sum;
    }
    public int c(int n,int[] nums,int[] dp)
    {
        if(n>=nums.length)
        {
            return 0;
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        int a=nums[n]+c((n+2),nums,dp);
        int b=c((n+1),nums,dp);
        dp[n]=Math.max(a,b);
        return dp[n];
    }
}