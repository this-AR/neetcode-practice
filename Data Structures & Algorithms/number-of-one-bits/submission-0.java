class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n!=0)
        {
            int t=n&1;
            if(t==1)
            count++;
            n=n>>1;
        }        
        return count;
    }
}
