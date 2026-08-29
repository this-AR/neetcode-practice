class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> l= new ArrayList<>();
        for(int x=0;x<numCourses;x++)
        {
            l.add(new ArrayList<>());
        }
        for(int[] a :prerequisites)
        {
            l.get(a[1]).add(a[0]);
        }
        int[] d=new int[numCourses];
        for(int x=0;x<numCourses;x++)
        {
            for(int v:l.get(x))
            {
                d[v]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int x=0;x<numCourses;x++)
        {
            if(d[x]==0)
            q.add(x);
        }
        int c=0;
        while(!q.isEmpty())
        {
            int t=q.poll();
            c++;
            for(int v:l.get(t))
            {
                d[v]--;
                if(d[v]==0)
                {
                    q.add(v);
                }
            }
        }
        if(c==numCourses)
        return true;
        return false;
        
    }
}
