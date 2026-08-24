class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int t=s.lastIndexOf(" ");
        return (s.substring(t+1)).length();
        
    }
}