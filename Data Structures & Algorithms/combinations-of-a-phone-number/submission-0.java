class Solution {
    List<String> ans=new ArrayList<>();
    static final String[] MAP = {
        "",      
        "",      
        "abc",   
        "def",   
        "ghi",  
        "jkl",   
        "mno",   
        "pqrs",  
        "tuv",   
        "wxyz"   
    };
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0)
        return ans;
        find(digits,0,new StringBuilder());    
        return ans;    
    }
    public void find(String digits,int n,StringBuilder sb)
    {
        if(n==digits.length())
        {
            ans.add(sb.toString());
            return;
        }
        int val=digits.charAt(n)-'0';
        String temp=MAP[val];
        for(int x=0;x<temp.length();x++)
        {
            sb.append(temp.charAt(x));
            find(digits,n+1,sb);
            sb.deleteCharAt(sb.length() - 1);
        }
    }













}
