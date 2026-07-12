class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        for(int[] r:dp)
        {
            Arrays.fill(r,-1);
        }
        return find(m,n,0,0,dp);
        
    }
    int find(int m , int n , int i , int j,int[][] dp)
    {
        if(i==(m-1) && (n-1)==j)
        return 1;
        if(dp[i][j]!=-1)
        return dp[i][j];

        int a=0,b=0;
        if(i!=(m-1))
        {
            a=find(m,n,i+1,j,dp);
        }
        if(j!=(n-1))
        {
            b=find(m,n,i,j+1,dp);
        }
        return dp[i][j]=a+b;
    }
}
