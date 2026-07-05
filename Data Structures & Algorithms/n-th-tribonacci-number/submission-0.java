class Solution {
    public int tribonacci(int n) {
        if(n==0)
        return n;
        if(n<=2)
        return 1;

        int a=0,b=1,c=1;
        for(int x=3;x<=n;x++)
        {
            int d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        return c;
        
    }
}