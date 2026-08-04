class Solution {
    int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};
    int rows, cols;

    public void solve(char[][] board) {
        rows = board.length;
        cols = board[0].length;
        for (int i = 0; i < rows; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0);
            if (board[i][cols - 1] == 'O') dfs(board, i, cols - 1);
        }

        for (int j = 0; j < cols; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j);
            if (board[rows - 1][j] == 'O') dfs(board, rows - 1, j);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == 'T')
                    board[i][j] = 'O';
            }
        }
    }

    private void dfs(char[][] board, int r, int c) {
        if (r < 0 || r >= rows || c < 0 || c >= cols)
            return;

        if (board[r][c] != 'O')
            return;

        board[r][c] = 'T';

        for (int[] d : dirs) {
            dfs(board, r + d[0], c + d[1]);
        }
    }
}