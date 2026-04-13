class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=-1;
        for(int x: piles)
        {
            if(x>max)
            max=x;
        }
        int f=1, e=max;
        int best=max;
        while(f<=e)
        {
            int m=f +(e-f)/2;
            int temp=0;
            for(int x: piles)
        {
            temp+=(int)Math.ceil(((double)x/m));
        }
        if(temp>h)
        {
            f=m+1;
        }
        else 
        {
            best=m;
            e=m-1;
        }

        }
        return best;
    }
}
