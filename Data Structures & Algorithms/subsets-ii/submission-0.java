class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        sub(nums,0,new ArrayList<>());
        return ans;

    }
    public void sub(int[] nums ,int n , List<Integer> l)
    {
        if(n==nums.length)
        {
        ans.add(new ArrayList<>(l));
        return;
        }
        l.add(nums[n]);
        sub(nums, n+1 ,l);
        l.remove(l.size()-1);
        int next = n + 1;
        while (next < nums.length && nums[next] == nums[n]) {
            next++;
        }
        sub(nums,next,l);


    }
}
