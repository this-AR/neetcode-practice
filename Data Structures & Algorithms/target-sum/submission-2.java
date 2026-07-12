
class Solution {
    Map<String, Integer> dp = new HashMap<>();

    public int findTargetSumWays(int[] nums, int target) {
        return find(nums, target, 0, 0);
    }

    int find(int[] nums, int target, int cur, int i) {
        if (i == nums.length)
            return cur == target ? 1 : 0;

        String key = i + "," + cur;

        if (dp.containsKey(key))
            return dp.get(key);

        int ans = find(nums, target, cur + nums[i], i + 1)
                + find(nums, target, cur - nums[i], i + 1);

        dp.put(key, ans);

        return ans;
    }
}