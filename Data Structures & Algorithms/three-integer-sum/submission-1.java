class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for (int x = 0; x < nums.length - 2; x++)
        {
            int s=-1;
            int f=x+1,r=nums.length-1;
            while(f<r)
            {
                s=nums[x]+nums[f]+nums[r];
                if(s==0)
                {
                    list.add(Arrays.asList(nums[x],nums[f],nums[r]));
                    f++;
                    r--;
                    while (f < r && nums[f] == nums[f - 1]) f++;
                    while (f < r && nums[r] == nums[r + 1]) r--;
                }
                else
                {
                    if(s>0)
                    r--;
                    else 
                    f++;
                }

            }
            while(x<nums.length-2 && nums[x]==nums[x+1])
            x++;
        }
        return list;
        
    }
}
