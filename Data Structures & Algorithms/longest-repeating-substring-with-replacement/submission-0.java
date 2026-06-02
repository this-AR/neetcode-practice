

class Solution {
    public int characterReplacement(String s, int k) {
        if (s.length() == 1)
            return 1;

        HashMap<Character, Integer> hp = new HashMap<>();

        int l = 0, r = 0;
        int maxLen = 0;
        int maxFreq = 0;

        while (r < s.length()) {

            char c = s.charAt(r);
            hp.put(c, hp.getOrDefault(c, 0) + 1);

            maxFreq = Math.max(maxFreq, hp.get(c));

            while ((r - l + 1) - maxFreq > k) {
                char leftChar = s.charAt(l);

                hp.put(leftChar, hp.get(leftChar) - 1);

                l++;
            }

            maxLen = Math.max(maxLen, r - l + 1);

            r++;
        }

        return maxLen;
    }
}