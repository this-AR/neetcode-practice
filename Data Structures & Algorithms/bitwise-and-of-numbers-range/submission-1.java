class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int res=0;
        int x=1;
        while(left!=0)
        {
            if(left==right)
            {
                res=left;
                break;
            }
            left>>=x;
            right>>=x;
            left<<=x;
            right<<=x;
            x++;
        }
        return res;
    }
}