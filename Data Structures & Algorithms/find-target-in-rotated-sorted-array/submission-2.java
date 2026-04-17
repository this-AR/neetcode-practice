class Solution {
    public int search(int[] nums, int target) {

        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int pivot = left;
        right = nums.length - 1;
        if (target <= nums[right]) {
            left = pivot;

            while (left <= right) {
                int m = left + (right - left) / 2;

                if (nums[m] == target) return m;
                else if (nums[m] > target) right = m - 1;
                else left = m + 1;
            }
        }
        else {
            int s = 0, e = pivot - 1;

            while (s <= e) {
                int m = s + (e - s) / 2;

                if (nums[m] == target) return m;
                else if (nums[m] > target) e = m - 1;
                else s = m + 1;
            }
        }

        return -1;
    }
}