class Solution {
    public int findKthLargest(int[] nums, int k) {
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int x:nums)
        {
            pq.offer(x);
        }
        int t=0;
        for(int x=0;x<k;x++)
        {
            t=pq.poll();
        }
        return t;

        
    }
}
