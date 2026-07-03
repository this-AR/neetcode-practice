class Solution {
    boolean found = false;
    public boolean makesquare(int[] matchsticks) {
        int sum=0;
        for(int x:matchsticks)
        {
            sum+=x;
        }
        if(sum%4!=0)
        return false;

        sum=sum/4;
        int[] gsum={sum,sum,sum,sum};
        find(matchsticks,gsum,0);
        return found;
    }
    void find(int[] m,int[] g,int n)
    {
        if(allZero(g))
        {
            found=true;
            return;
        }
        if(n==m.length)
        return;
        for(int x=0;x<4;x++)
        {
            if(g[x]-m[n]<0)
            continue;
            g[x]-=m[n];
            
            find(m,g,n+1);
            g[x]+=m[n];
        }
    }
    boolean allZero(int[] arr) {
    for (int x : arr) {
        if (x != 0) {
            return false;
        }
    }
    return true;
}









}