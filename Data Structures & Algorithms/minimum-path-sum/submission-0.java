class Solution {
    int[][] dp;

    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        dp = new int[m][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return find(grid, 0, 0);
    }

    private int find(int[][] grid, int i, int j) {
        if (i == grid.length || j == grid[0].length)
            return Integer.MAX_VALUE;

        if (i == grid.length - 1 && j == grid[0].length - 1)
            return grid[i][j];

        if (dp[i][j] != -1)
            return dp[i][j];

        int down = find(grid, i + 1, j);
        int right = find(grid, i, j + 1);

        dp[i][j] = grid[i][j] + Math.min(down, right);

        return dp[i][j];
    }
}