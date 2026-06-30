class Solution {
    public int subsetXORSum(int[] nums) {
        return cal(nums, 0, 0);
    }

    public int cal(int[] nums, int idx, int xor) {
        if (idx == nums.length) {
            return xor;
        }
        int include = cal(nums, idx + 1, xor ^ nums[idx]);
        int exclude = cal(nums, idx + 1, xor);

        return include + exclude;
    }
}