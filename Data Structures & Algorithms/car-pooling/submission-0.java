class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips,(a,b)->Integer.compare(a[1],b[1]));
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->Integer.compare(a[1],b[1]));
        int c=0;
        for(int[] trip:trips)
        {
            int p=trip[0];
            int f=trip[1];
            int t=trip[2];
            while(!pq.isEmpty()&& pq.peek()[1]<=f)
            {
                c-=pq.poll()[0];
            }
            c+=p;
            if(c>capacity)
            return false;
            pq.offer(new int[]{p,t});
        }
        return true;
    }
}