class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())
        return false;
        HashMap<Character, Integer> hp = new HashMap<>();
        HashMap<Character, Integer> hq = new HashMap<>();
        int x=0;
        int l1=s1.length();
        for(;x<l1;x++)
        {
            char c=s1.charAt(x);
            char b=s2.charAt(x);
            hp.put(c, hp.getOrDefault(c, 0) + 1);
            hq.put(b, hq.getOrDefault(b, 0) + 1);
        }
        if (hp.equals(hq))
            return true;
        for(;x<s2.length();x++)
        {
            if (hp.equals(hq))
            return true;
            char b=s2.charAt(x);
            char c=s2.charAt(x-l1);
            hq.put(c, hq.get(c) - 1);

            if (hq.get(c) == 0) {
                hq.remove(c);
            }
            hq.put(b, hq.getOrDefault(b, 0) + 1);
            
        }
        return hp.equals(hq);

        

        
    }
}
