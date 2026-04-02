class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int f=0,r=people.length-1;
        int count=0;
        while(f<=r)
        {
            if(f==r)
            {
                count+=1;
                r--;
            }
            else
            {
                if((people[f]+people[r])<=limit)
                {
                    count+=1;
                    f++;
                    r--;
                }
                else
                {
                    count+=1;
                    r--;
                }
            }
        }
        return count;
    }
}