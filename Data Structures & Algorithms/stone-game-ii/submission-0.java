class Solution {
    int[][] dp;
    int[] suffix;
    int n;

    public int stoneGameII(int[] piles) {
        n = piles.length;
        suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        dp = new int[n][n + 1];

        for (int i = 0; i < n; i++) {
            java.util.Arrays.fill(dp[i], -1);
        }

        return solve(0, 1);
    }

    private int solve(int i, int M) {
        if (i >= n) {
            return 0;
        }

        if (dp[i][M] != -1) {
            return dp[i][M];
        }
        if (2 * M >= n - i) {
            return dp[i][M] = suffix[i];
        }

        int opponentBest = Integer.MAX_VALUE;
        for (int X = 1; X <= 2 * M; X++) {
            opponentBest = Math.min(
                opponentBest,
                solve(i + X, Math.max(M, X))
            );
        }
        return dp[i][M] = suffix[i] - opponentBest;
    }
}