class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if (n == 1) return nums[0];
        int a=0,b=0,c=0,d=0;
        for(int x=n-1;x>=1;x--)
        {
            int temp=Math.max(b+nums[x],a);
            b=a;
            a=temp;
        }
        for(int x=n-2;x>=0;x--)
        {
            int temp=Math.max(d+nums[x],c);
            d=c;
            c=temp;
        }
        return Math.max(a,c);

        
    }
}
