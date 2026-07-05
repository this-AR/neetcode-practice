class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);

        return Math.min(cal(cost, dp, 0), cal(cost, dp, 1));
    }

    int cal(int[] cost, int[] dp, int i) {
        if (i >= cost.length) {
            return 0;
        }

        if (dp[i] != -1) {
            return dp[i];
        }

        dp[i] = cost[i] + Math.min(cal(cost, dp, i + 1),
                                   cal(cost, dp, i + 2));

        return dp[i];
    }
}