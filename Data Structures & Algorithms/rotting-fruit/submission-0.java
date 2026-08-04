class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();

        int r = grid.length, c = grid[0].length;

        for (int x = 0; x < r; x++) {
            for (int y = 0; y < c; y++) {
                if (grid[x][y] == 2) {
                    q.offer(new int[]{x, y});
                }
            }
        }

        int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int last = 2;

        while (!q.isEmpty()) {
            int[] cell = q.poll();
            int row = cell[0], col = cell[1];
            last = grid[row][col];

            for (int[] d : dirs) {
                int nr = row + d[0];
                int nc = col + d[1];

                if (nr < 0 || nr >= r || nc < 0 || nc >= c)
                    continue;

                if (grid[nr][nc] != 1)
                    continue;

                grid[nr][nc] = grid[row][col] + 1;
                q.offer(new int[]{nr, nc});
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (grid[i][j] == 1)
                    return -1;
            }
        }

        return last - 2;
    }
}