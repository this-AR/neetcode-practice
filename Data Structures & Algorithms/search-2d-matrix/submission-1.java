class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;
        int s = 0, e = rows - 1;
        int r = -1;
        while (s <= e) {
            int m = s + (e - s) / 2;

            if (matrix[m][0] <= target && matrix[m][cols - 1] >= target) {
                r = m;
                break;
            } else if (matrix[m][0] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }

        if (r == -1) return false;

        // Step 2: Search in row
        s = 0;
        e = cols - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (matrix[r][m] == target) return true;
            else if (matrix[r][m] > target) e = m - 1;
            else s = m + 1;
        }

        return false;
    }
}