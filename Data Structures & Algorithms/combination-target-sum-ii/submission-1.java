
class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);    
        solve(candidates, target, 0, new ArrayList<>());
        return ans;
    }

    void solve(int[] nums, int target, int index, List<Integer> curr) {

        if (target == 0) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        if (index == nums.length || target < 0)
            return;
        curr.add(nums[index]);
        solve(nums, target - nums[index], index + 1, curr);
        curr.remove(curr.size() - 1);

        int next = index + 1;
        while (next < nums.length && nums[next] == nums[index]) {
            next++;
        }

        solve(nums, target, next, curr);
    }
}