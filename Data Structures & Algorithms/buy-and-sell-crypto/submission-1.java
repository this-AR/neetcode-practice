class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int r=1,f=0;
        while(r<prices.length)
        {
            int d=prices[r]-prices[f];
            if(d>0)
            {
                r++;
                if(d>max)
                max=d;
            }
            else 
            {
                f=r;
                r++;
            }
        }
        return max;
    }
}
