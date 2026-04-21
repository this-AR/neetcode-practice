class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        for(int x: nums)
        {
            s.add(x);
        }
        if(s.size()==nums.length)
        return false;
        return true;

    }
}