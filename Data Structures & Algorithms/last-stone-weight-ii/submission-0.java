class Solution {
    Integer[][] dp;
    int total;

    public int lastStoneWeightII(int[] stones) {
        total = 0;
        for (int x : stones)
            total += x;

        dp = new Integer[stones.length][total + 1];

        return dfs(stones, 0, 0);
    }

    int dfs(int[] stones, int i, int sum) {
        if (i == stones.length)
            return Math.abs(total - 2 * sum);

        if (dp[i][sum] != null)
            return dp[i][sum];

        int take = dfs(stones, i + 1, sum + stones[i]);
        int skip = dfs(stones, i + 1, sum);

        return dp[i][sum] = Math.min(take, skip);
    }
}