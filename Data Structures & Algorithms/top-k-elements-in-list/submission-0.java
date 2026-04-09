class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i : nums) {
            m.put(i, m.getOrDefault(i, 0) + 1);
        }
        int[] f = new int[k];
        for (int x = 0; x < k; x++) {
            int max = -1, in = -1;
            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                int t = entry.getValue();
                if (t > max) {
                    max = t;
                    in = entry.getKey();
                }
            }
            m.remove(in);
            f[x] = in;
        }
        return f;
    }
}