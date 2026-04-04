class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int l=nums.length;
        for(int y=0;y<l-3;y++)
        {
            for(int x=y+1;x<l-2;x++)
            {
                long s=-1;
                int f=x+1,r=nums.length-1;
                while(f<r)
                {
                    s=(long)nums[x]+nums[f]+nums[r]+nums[y];
                    if(s==target)
                    {
                        list.add(Arrays.asList(nums[y],nums[x],nums[f],nums[r]));
                        f++;    
                        r--;
                        while (f < r && nums[f] == nums[f - 1]) f++;
                        while (f < r && nums[r] == nums[r + 1]) r--;
                    }
                    else
                    {
                    if(s>target)
                    r--;
                    else 
                    f++;
                    }
                }
                while(x<l-2 && nums[x]==nums[x+1])
                x++;

            }
            while(y<l-2 && nums[y]==nums[y+1])
            y++;
        }

      return list;   
    }
}