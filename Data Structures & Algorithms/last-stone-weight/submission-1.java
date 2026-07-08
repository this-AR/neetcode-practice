class Solution {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        if(stones.length==1)
        return stones[0];
        for(int x:stones)
        {
            pq.offer(x);
        }
        while(pq.size()>=2)
        {
            int a =pq.poll();
            int b=pq.poll();
            if(a!=b)
            pq.offer(Math.abs(a-b));
            
        }
        if(pq.size()==0)
        return 0;
        return pq.poll();
    }
}
