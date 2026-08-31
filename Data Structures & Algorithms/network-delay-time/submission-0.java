class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
         List<int[]>[] graph = new ArrayList[n + 1];
         for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] time : times) {
            int u = time[0];
            int v = time[1];
            int w = time[2];

            graph[u].add(new int[]{v, w});
        }
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[1] - b[1]);

        pq.add(new int[]{k, 0});

        dist[k]=0;
        while(!pq.isEmpty())
        {
            int[] curr = pq.poll();
            int node = curr[0];
            int d = curr[1];
            if (d != dist[node])
                continue;
            for(int[] edge:graph[node])
            {
                int nxt=edge[0];
                int w=edge[1];
                if(d+w<dist[nxt])
                {
                    dist[nxt]=d+w;
                    pq.add(new int[]{nxt,dist[nxt]});
                }
            }

        }
        int ans = 0;

        for (int i = 1; i <= n; i++) {

            if (dist[i] == Integer.MAX_VALUE)
                return -1;

            ans = Math.max(ans, dist[i]);
        }

        return ans;
    }
}
