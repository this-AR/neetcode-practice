class Solution {
    public int[] sortedSquares(int[] nums) {

        int l = 0;
        int r = nums.length - 1;

        int[] ans = new int[nums.length];

        for (int k = nums.length - 1; k >= 0; k--) {

            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                ans[k] = nums[l] * nums[l];
                l++;
            } else {
                ans[k] = nums[r] * nums[r];
                r--;
            }
        }

        return ans;
    }
}