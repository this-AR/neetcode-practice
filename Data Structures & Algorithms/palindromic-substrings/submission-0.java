class Solution {
    public int countSubstrings(String s) {
        int l=s.length();
        if(l<=1)
        return l;
        int count=0;
        boolean[][] dp=new boolean[l][l];
        for(int x=0;x<l;x++)
        {
            dp[x][x]=true;
            count++;
        }
        for(int x=0;x<l-1;x++)
        {
            if(s.charAt(x)==s.charAt(x+1))
            {
                dp[x][x+1]=true;
                count++;
            }
        }
        for (int len = 3; len <= l; len++) {

            for (int left = 0; left <= l - len; left++) {

                int right = left + len - 1;

                if (s.charAt(left) == s.charAt(right)
                        && dp[left + 1][right - 1]) {

                    dp[left][right] = true;
                    count++;
                }
            }
        }
        return count;
    }
}
