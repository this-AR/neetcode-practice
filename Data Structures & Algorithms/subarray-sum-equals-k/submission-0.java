class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> prefixSumCounts = new HashMap<>();
        prefixSumCounts.put(0, 1);
        
        int count = 0, currentSum = 0;
        
        for (int num : nums) {
            currentSum += num;
            count += prefixSumCounts.getOrDefault(currentSum - k, 0);
            prefixSumCounts.put(currentSum, prefixSumCounts.getOrDefault(currentSum, 0) + 1);
        }
        
        return count;
    }
}