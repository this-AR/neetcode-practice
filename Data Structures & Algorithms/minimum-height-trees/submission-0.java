class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if( n==1)
        return Collections.singletonList(0);

        List<Integer>[] adj =new ArrayList[n];
        for(int i=0;i<n;i++)
        {
            adj[i]=new ArrayList<>();
        }
        for(int[] edge : edges)
        {
            adj[edge[0]].add(edge[1]);
            adj[edge[1]].add(edge[0]);

        }
        int[] ec=new int[n];
        Queue<Integer> leaves=new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            ec[i]=adj[i].size();
            if(adj[i].size()==1)
            leaves.offer(i);

        }

        while(!leaves.isEmpty())
        {
            if(n<=2 ) return new ArrayList<>(leaves);
            int size=leaves.size();
            for(int i=0;i<size;i++)
            {
                int node=leaves.poll();
                n--;
                for (int nei : adj[node]) {
                    ec[nei]--;
                    if (ec[nei] == 1)
                        leaves.offer(nei);
                }
            }
        }
        return new ArrayList<>();










    }
}