class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        if(n<=1)
        return s;
        int max=0;
       
        String maxs="";
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j <= n; j++) {
            String w=s.substring(i,j);
            if(w.length()>max && isPalindrome(w))
            {
                maxs=w;
                max=w.length();
            }
        }
    }
    return maxs;
    }
    public boolean isPalindrome(String s) {
    int left = 0;
    int right = s.length() - 1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}
}
