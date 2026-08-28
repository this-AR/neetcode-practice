class Solution {
    public int compress(char[] chars) {
        String w = "";
        int x = 0;

        while (x < chars.length) {
            char c = chars[x];
            int count = 0;

            while (x < chars.length && chars[x] == c) {
                x++;
                count++;
            }

            w += c;

            if (count > 1) {
                w += count;
            }
        }

        for (int i = 0; i < w.length(); i++) {
            chars[i] = w.charAt(i);
        }

        return w.length();
    }
}