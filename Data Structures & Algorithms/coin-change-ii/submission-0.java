class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
        dp=new int[coins.length][amount+1];
        for(int[] x:dp)
        {
            Arrays.fill(x,-1);
        }     
        return find(coins, amount,0);   
    }
    int find(int[] coins,int amount,int i )
    {
        if(amount==0)
        return 1;
        if(i==coins.length)
        return 0;

        if(dp[i][amount]!=-1)
        return dp[i][amount];

        int t=0;
        if(coins[i]<=amount)
        t=find(coins,amount-coins[i],i);

        int not=find(coins,amount,i+1);

        return dp[i][amount]=t+not;
    }
}
