class Solution {
    public int[] countBits(int n) {
        int[] a=new int[n+1];
        for(int x=0;x<=n;x++)
        {
            int count = 0;
            int t=x;
            while (t > 0) {
                 t = t & (t - 1);
                count++;
                }
                a[x]=count;
        }
        return a;
    }
}
