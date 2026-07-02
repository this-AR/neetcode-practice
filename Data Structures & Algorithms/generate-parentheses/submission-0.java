class Solution {

    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        gp(n, n, "");
        return ans;
    }

    void gp(int open, int close, String curr) {

        if (open > close)
            return;

        if (open == 0 && close == 0) {
            ans.add(curr);
            return;
        }

        if (open > 0)
            gp(open - 1, close, curr + "(");

        if (close > 0)
            gp(open, close - 1, curr + ")");
    }
}