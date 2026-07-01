class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        s(nums,target,0,new ArrayList<>());
        return ans;
        
    }
    public void s(int[] nums,int t, int n,List<Integer> l)
    {
        if(n==nums.length || t<0)
        return ;
        if(t==0)
        {
            ans.add(new ArrayList<>(l));
            return;
        }
        l.add(nums[n]);
        
        s(nums,(t-nums[n]),(n),l);
        l.remove(l.size()-1);
        s(nums,t,(n+1),l);

        
        

    }
}

