class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        gp(n, n, new StringBuilder());
        return ans;
    }

    void gp(int open, int close, StringBuilder sb) {
        if (open > close) return;

        if (open == 0 && close == 0) {
            ans.add(sb.toString());
            return;
        }

        if (open > 0) {
            sb.append('(');
            gp(open - 1, close, sb);
            sb.deleteCharAt(sb.length() - 1);
        }

        if (close > 0) {
            sb.append(')');
            gp(open, close - 1, sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}