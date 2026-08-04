class Solution {
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    int rows, cols;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        rows = heights.length;
        cols = heights[0].length;

        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            dfs(heights, pacific, i, 0);
            dfs(heights, atlantic, i, cols - 1);
        }

        for (int j = 0; j < cols; j++) {
            dfs(heights, pacific, 0, j);
            dfs(heights, atlantic, rows - 1, j);
        }

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }

        return ans;
    }

    private void dfs(int[][] heights, boolean[][] visited, int r, int c) {
        if (visited[r][c]) return;

        visited[r][c] = true;

        for (int[] d : dirs) {
            int nr = r + d[0];
            int nc = c + d[1];

            if (nr < 0 || nr >= rows || nc < 0 || nc >= cols)
                continue;

            if (visited[nr][nc])
                continue;

            if (heights[nr][nc] < heights[r][c])
                continue;

            dfs(heights, visited, nr, nc);
        }
    }
}