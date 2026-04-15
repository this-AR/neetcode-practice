class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s=0;
        int max=0;
        for(int x:weights)
        {
            s+=x;
            if(x>max)
            max=x;
        }
        int f=max,e=s;
        int weight=s;
        while(f<=e)
        {
            int m=f+(e-f)/2;
            int sum=0;
            int count=1;
            for(int x:weights)
            {
              if(x>m)
              {
                count=days+1;
                break;
              }   
              else if( sum+x<=m)
              {
                sum=sum+x;
              }
              else 
              {
                count++;
                sum=x;
              }
            }
            if(count>days)
            {
                f=m+1;
            }
            else 
            {
                e=m-1;
                weight=m;
            }
            
        }
        return weight;
    }
}