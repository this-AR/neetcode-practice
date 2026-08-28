class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int m = Integer.MAX_VALUE;
        int l = 0;
        int sum = 0;

        for (int r = 0; r < nums.length; r++) {
            sum += nums[r];

            while (sum >= target) {
                m = Math.min(m, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }

        return m == Integer.MAX_VALUE ? 0 : m;
    }
}