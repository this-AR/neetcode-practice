class Solution {
    public int[] countBits(int n) {
        int[] a=new int[n+1];
        for(int x=0;x<=n;x++)
        {
                a[x]=Integer.bitCount(x);;
        }
        return a;
    }
}
