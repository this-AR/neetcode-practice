class Solution {

    public boolean isInterleave(String s1, String s2, String s3) {

        if (s1.length() + s2.length() != s3.length())
            return false;

        Boolean[][] dp = new Boolean[s1.length() + 1][s2.length() + 1];

        return find(s1, s2, s3, 0, 0, dp);
    }

    boolean find(String s1, String s2, String s3,
                 int i, int j,
                 Boolean[][] dp) {

        if (dp[i][j] != null)
            return dp[i][j];

        int k = i + j;

        if (k == s3.length())
            return i == s1.length() && j == s2.length();

        boolean ans = false;

        if (i < s1.length() && s1.charAt(i) == s3.charAt(k))
            ans = find(s1, s2, s3, i + 1, j, dp);

        if (!ans &&
            j < s2.length() &&
            s2.charAt(j) == s3.charAt(k))
            ans = find(s1, s2, s3, i, j + 1, dp);

        dp[i][j] = ans;

        return ans;
    }
}