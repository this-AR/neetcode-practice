class Solution {
    public int trap(int[] height) {
        int s=0,f=height[height.length-1],r=height.length-1;
        int[] a=new int[r+1];
        a[r]=0;
        int max=f;
        for(int x=r-1;x>=0;x--)
        {
            a[x]=max;
            if(height[x]>max)
            {
                max=height[x];
            }
        }
        max=height[0];
        for(int x=1;x<=r-1;x++)
        {
            s=s+Math.max(0,Math.min(max,a[x])-height[x]);
            if(max<height[x])
            max=height[x];
        }
        return s;

    }
}
