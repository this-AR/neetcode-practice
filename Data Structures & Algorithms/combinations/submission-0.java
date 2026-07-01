class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        comb(n, k, new ArrayList<>(), 1);
        return ans;
    }

    public void comb(int n, int k, List<Integer> l, int val) {

        if (k == 0) {
            ans.add(new ArrayList<>(l));
            return;
        }

        if (val > n)
            return;
        l.add(val);
        comb(n, k - 1, l, val + 1);
        l.remove(l.size() - 1);
        comb(n, k, l, val + 1);
    }
}