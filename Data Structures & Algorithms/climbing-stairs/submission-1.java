class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return calc(n,0,dp);
        
    }
    int calc(int n,int i,int[] dp)
    {
        if(i==n)
        return 1;
        if(i>n)
        return 0;

        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int ways=calc(n,i+1,dp)+calc(n,i+2,dp);
        dp[i]=ways;
        return dp[i];
        
    }
}
