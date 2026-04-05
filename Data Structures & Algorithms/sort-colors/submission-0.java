class Solution {
    public void sortColors(int[] nums) {
        int[] n=new int[3];
        for(int x=0;x<nums.length;x++)
        {
            n[nums[x]]++;
        }
        int y=0;
        for(int x=0;x<3;x++)
        {
            while(n[x]!=0)
            {
                nums[y]=x;
                y++;
                n[x]--;
            }
        }
}
}