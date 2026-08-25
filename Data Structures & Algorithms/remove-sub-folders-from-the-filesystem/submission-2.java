class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        String w=folder[0];
        int len=w.length();
        List<String> l=new ArrayList<>();
        l.add(w);
        for(int x=1;x<folder.length;x++)
        {
               if(!folder[x].startsWith(w+"/"))
            {
                l.add(folder[x]);
                w=folder[x];
            }
           
          
        }
        
        return l;
    }
}