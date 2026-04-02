class Solution {
    public void rotate(int[] nums, int k) {
        int l=nums.length;
        k=k%l;
        int f=0;
        int r=l-1;
        while(f<r)
        {
            int temp=nums[r];
            nums[r]=nums[f];
            nums[f]=temp;
            f++;r--;
        }
        f=0;
        int m=k-1;
        while(f<m)
        {
            int temp=nums[m];
            nums[m]=nums[f];
            nums[f]=temp;
            f++;m--;
        }
        m=k;r=l-1;
        while(m<r)
        {
            int temp=nums[r];
            nums[r]=nums[m];
            nums[m]=temp;
            m++;r--;
        }


    }
}