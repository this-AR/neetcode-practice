class Solution {
    boolean found = false;
    public boolean canPartitionKSubsets(int[] nums, int k) {
            int sum = 0;
        for (int x : nums) {
            sum += x;
        }

        if (sum % k != 0)
            return false;

        sum /= k;
        Arrays.sort(nums);
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        int[] gsum = new int[k];
        Arrays.fill(gsum,sum);
        find(nums, gsum, 0);

        return found;
        
    }

    void find(int[] nums,int[] g,int n)
    {
        if(found==true)
        return;
        
        if (n == nums.length) {
            found = allZero(g);
            return;
        }
        for (int x = 0; x < g.length; x++) {

            if (g[x] < nums[n])
                continue;

            g[x] -= nums[n];

            find(nums, g, n + 1);

            g[x] += nums[n];

            // if (g[x] == g[0] || (x > 0 && g[x] == g[x - 1]))
            //     break;
        }


    }
    boolean allZero(int[] arr) {
        for (int x : arr) {
            if (x != 0)
                return false;
        }
        return true;
    }
















}