class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int r=right;
        right--;
        while(left<right)
        {
            r&=left&right;
            left++;
            right--;
        }
        if(left==right)
        r=r&left;

        return r;
        
    }
}