class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {
        gen(s, new ArrayList<>());
        return ans;
    }

    void gen(String s, List<String> l) {

        if (s.length() == 0) {
            ans.add(new ArrayList<>(l));
            return;
        }

        for (int x = 0; x < s.length(); x++) {

            String w = s.substring(0, x + 1);

            if (isPalindrome(w)) {

                l.add(w);

                gen(s.substring(x + 1), l);

                l.remove(l.size() - 1);   // backtrack
            }
        }
    }

    boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}