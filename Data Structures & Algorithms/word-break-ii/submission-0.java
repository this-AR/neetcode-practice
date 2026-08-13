class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        find(s, wordDict, "", 0);
        return ans;
    }

    void find(String s, List<String> wordDict, String w, int i) {
        if (i == s.length()) {
            ans.add(w.trim());
            return;
        }

        for (String word : wordDict) {
            if (s.startsWith(word, i)) {
                find(s,wordDict,w + word + " ",i + word.length()
                );
            }
        }
    }
}