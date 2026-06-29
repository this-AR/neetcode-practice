class Solution {
    public int[] countBits(int n) {
        int[] a=new int[n+1];
        for(int x=0;x<=n;x++)
        {
            int count = 0;
            int t=x;
            while (t > 0) {
                if ((t & 1) == 1)
                    count++;
                t = t >> 1;
                }
                a[x]=count;
        }
        return a;
    }
}
