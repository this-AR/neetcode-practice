class Solution {
    public String longestCommonPrefix(String[] strs) {
        String w="";
        int m=200;
        for(String s:strs)
        {
            int l=s.length();
            m=Math.min(m,l);
        }
        int l=strs.length;
        int p=0;
        for(int x=0;x<m;x++)
        {
            char c=strs[0].charAt(p);
            for(int y=1;y<l;y++)
            {
                char c1=strs[y].charAt(p);
                if(c1!=c)
                return w;
            }
            w=w+c;
            p++;
        }
        return w;
    }
}