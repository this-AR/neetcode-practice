class Solution {

    boolean found = false;

    int[] dr = {-1, 1, 0, 0};
    int[] dc = {0, 0, -1, 1};

    public boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;

        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == word.charAt(0))
                    dfs(board, word, i, j, 0, vis);

            }
        }

        return found;
    }

    void dfs(char[][] board, String word, int r, int c,
             int idx, boolean[][] vis) {

        if (found)
            return;

        if (idx == word.length()) {
            found = true;
            return;
        }

        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length)
            return;

        if (vis[r][c])
            return;

        if (board[r][c] != word.charAt(idx))
            return;

        vis[r][c] = true;

        for (int k = 0; k < 4; k++) {
            dfs(board, word,
                r + dr[k], c + dc[k],
                idx + 1, vis);
        }

        vis[r][c] = false;
    }
}