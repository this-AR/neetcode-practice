class Solution {

    Boolean[] memo;

    public boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String> set = new HashSet<>(wordDict);

        memo = new Boolean[s.length()];

        return dfs(s, set, 0);
    }

    private boolean dfs(String s, HashSet<String> set, int i) {

        if (i == s.length())
            return true;

        if (memo[i] != null)
            return memo[i];

        for (int j = i; j < s.length(); j++) {

            if (set.contains(s.substring(i, j + 1))) {

                if (dfs(s, set, j + 1)) {
                    memo[i] = true;
                    return true;
                }
            }
        }

        memo[i] = false;
        return false;
    }
}