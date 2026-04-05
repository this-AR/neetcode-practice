class Solution {
    public int firstMissingPositive(int[] nums) {
        int k=-1;
        HashSet<Integer> s = new HashSet<>();
        int max=-1;
        for(int x:nums){
            s.add(x);
            if(max<x)
            max=x;
        }
        if(max<1)
        k= 1;
        else {
            int x=0;
            for( x=1;x<max;x++)
            {
                if(!(s.contains(x)))
                {
                    k= x;
                    break;
                }
            }
            if(x==max)
            {
                k= max+1;
            }
        }

        return k;
    }
}