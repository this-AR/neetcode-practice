class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] rank=new int[26];
        for(int x=0;x<order.length();x++)
        {
            rank[order.charAt(x)-'a']=x;
        }

        for (int x=0;x<words.length-1;x++)
        {
            if( !inc(words[x],words[x+1],rank))
            {
                return false;
            }
        }
        return true;

    }

    public boolean inc(String w1, String w2,int[] rank)
    {
        int n=Math.min(w1.length(),w2.length());
        for(int i=0;i<n;i++)
        {
            char c=w1.charAt(i);
            char c2=w2.charAt(i);
            if(c!=c2)
            {
                return rank[c-'a']<rank[c2-'a'];
            }
        }
        return w1.length()<=w2.length();
    }
}