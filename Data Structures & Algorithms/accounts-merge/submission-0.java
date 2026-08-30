class UnionFind{
    int[] parent;
    int[] rank;
    public UnionFind(int n)
    {
        parent=new int[n];
        rank=new int[n];
        for(int i=0;i<n;i++)
        {
            parent[i]=i;
            rank[i]=1;
        }
    }
    public boolean union(int x1,int x2)
    {
        int p1=find(x1);
        int p2=find(x2);
        if(p1==p2)
        return false;

        if (rank[p1]>rank[p2])
        {
            parent[p2]=p1;
            rank[p1]=rank[p2];
        }
        else {
            parent[p1] = p2;
            rank[p2] += rank[p1];
        }
        return true;
}
public int find(int x)
{
    if(x!=parent[x])
    {
        parent[x]=find(parent[x]);

    }
    return parent[x];
}
}
class Solution {
    
    
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        int n=accounts.size();
        UnionFind uf=new UnionFind(n);
        Map<String ,Integer> e=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            List<String> account=accounts.get(i);
            for(int j=1;j<account.size();j++)
            {
                String email=account.get(j);
                if(e.containsKey(email))
                {
                    uf.union(i,e.get(email));
                }
                else{
                    e.put(email,i);
                }
            }
        }
        Map<Integer,List<String>> emailgroup=new HashMap<>();
        for(Map.Entry<String,Integer>entry:e.entrySet())
        {
            String email=entry.getKey();
            int accid=entry.getValue();
            int leader=uf.find(accid);
            emailgroup.putIfAbsent(leader,new ArrayList<>());
            emailgroup.get(leader).add(email);
        }
        List<List<String>> res=new ArrayList<>();
        for(Map.Entry<Integer,List<String>> entry:emailgroup.entrySet())
        {
            int accid=entry.getKey();
            List<String> emails=entry.getValue();
            Collections.sort(emails);
            List<String> merged = new ArrayList<>();
            merged.add(accounts.get(accid).get(0));
            merged.addAll(emails);
            res.add(merged);

        }
    return res;



        
    }
}