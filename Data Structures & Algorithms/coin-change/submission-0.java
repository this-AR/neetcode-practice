class Solution {
    int val = Integer.MAX_VALUE;
    public int coinChange(int[] coins, int amount) {
        find(coins,amount,new ArrayList<>(),0);
        if(val==Integer.MAX_VALUE)
        return -1;
        return val;

        
    }
    void find(int[] coins, int a,List<Integer> l,int n)
    {
        if(l.size()>val)
        return;
        if(a==0)
        {
            val=l.size();
        }
        if(a<0 || n==coins.length)
        return;

        l.add(coins[n]);
        find(coins,a-coins[n],l,n);
        l.remove(l.size()-1);
        find(coins,a,l,n+1);




    }
}
