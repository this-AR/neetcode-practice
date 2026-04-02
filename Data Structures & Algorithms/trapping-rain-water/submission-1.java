class Solution {
    public int trap(int[] height) {
        int f=0,r=height.length-1;
        int fm=0,rm=0;
        int s=0;
        while(f<r)
        {
            if(height[f]>height[r])
            {
                s=s+Math.max(0,rm-height[r]);
                rm=rm>height[r]?rm:height[r];
                r--;
            }
            else
            {
                s=s+Math.max(0,fm-height[f]);
                fm=fm>height[f]?fm:height[f];
                f++;
            }
        }
        return s;
    }
}
