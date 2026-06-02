class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        if(s.equals(""))
        return 0;
        int max=0;
        int l=0,r=0;
        while(r<s.length())
        {
            char c=s.charAt(r);
            if(set.add(c))
            {
                if((r-l+1)>max)
                max=r-l+1;
                
            }
            else 
            {
                while(!(set.add(c)))
                {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
            r++;
        }
        return max;
    }
}
