class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n=profits.length;
        Integer[] id= new Integer[n];
        for(int i=0;i<n;i++)
        {
            id[i]=i;
        }
        Arrays.sort(id,(i,j)->capital[i]-capital[j]);
        PriorityQueue<Integer> mh=new PriorityQueue<>((i,j)-> profits[j]-profits[i]);
        int i=0;
        for(int p=0;p<k;p++)
        {
            while(i<n &&  capital[id[i]]<=w)
            {
                mh.offer(id[i]);
                i++;
            }
            if(mh.isEmpty())
            break;

            int pr=mh.poll();
            w+=profits[pr];
        }
        return w;

    }
}