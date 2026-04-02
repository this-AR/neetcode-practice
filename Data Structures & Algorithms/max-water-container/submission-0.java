class Solution {
    public int maxArea(int[] heights) {
        int s=0,f=0,r=heights.length-1,max=0;
        for(int x:heights)
        s+=x;
        while(f<r)
        {
            int m=(Math.min(heights[f],heights[r]))*(r-f);
            if(m>max)
            max=m;
            if(heights[f]>heights[r])
            {
                r--;
                s-=heights[r];
            }
            else 
            {
                f++;
                s-=heights[f];
            }
        }
        return max;
    }
}
