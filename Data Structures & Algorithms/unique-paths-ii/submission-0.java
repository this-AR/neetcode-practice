class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if (obstacleGrid[m - 1][n - 1] == 1)
            return 0;

        int[][] dp = new int[m][n];

        for (int[] row : dp)
            Arrays.fill(row, -1);

        return find(obstacleGrid, 0, 0, dp);
    }

    int find(int[][] grid, int i, int j, int[][] dp) {

        if (i == grid.length - 1 && j == grid[0].length - 1)
            return 1;

        if (i == grid.length || j == grid[0].length)
            return 0;

        if (grid[i][j] == 1)
            return 0;

        if (dp[i][j] != -1)
            return dp[i][j];

        dp[i][j] = find(grid, i + 1, j, dp)
                 + find(grid, i, j + 1, dp);

        return dp[i][j];
    }
}