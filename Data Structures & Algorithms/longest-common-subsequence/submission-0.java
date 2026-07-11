class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1 = text1.length(), l2 = text2.length();

        int[][] ar = new int[l1 + 1][l2 + 1];
        for (int[] row : ar) {
            Arrays.fill(row, -1);
        }

        return lcs(text1, text2, 0, 0, ar);
    }

    int lcs(String text1, String text2, int i, int j, int[][] ar) {
        if (i == text1.length() || j == text2.length()) {
            return 0;
        }

        if (ar[i][j] != -1)
            return ar[i][j];

        if (text1.charAt(i) == text2.charAt(j)) {
            return ar[i][j] = 1 + lcs(text1, text2, i + 1, j + 1, ar);
        }

        return ar[i][j] = Math.max(
            lcs(text1, text2, i, j + 1, ar),
            lcs(text1, text2, i + 1, j, ar)
        );
    }
}