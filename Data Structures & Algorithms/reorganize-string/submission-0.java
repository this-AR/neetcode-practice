class Solution {
    public String reorganizeString(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(int x=0;x<s.length();x++)
        {
            char c=s.charAt(x);
            m.put(c,m.getOrDefault(c,0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq =
            new PriorityQueue<>(
                (a, b) -> Integer.compare(b.getValue(), a.getValue())
            );

        pq.addAll(m.entrySet());
        
        StringBuilder ans = new StringBuilder();

        Map.Entry<Character, Integer> prev = null;

        while (!pq.isEmpty()) {

            Map.Entry<Character, Integer> curr = pq.poll();
            if (prev != null && curr.getKey() == prev.getKey()) {
                if (pq.isEmpty()) {
                    return "";
                }

                Map.Entry<Character, Integer> next = pq.poll();

                ans.append(next.getKey());

                next.setValue(next.getValue() - 1);

                if (next.getValue() > 0) {
                    pq.offer(next);
                }

                prev = next;
                pq.offer(curr);

            } else {

                ans.append(curr.getKey());

                curr.setValue(curr.getValue() - 1);

                if (curr.getValue() > 0) {
                    pq.offer(curr);
                }

                prev = curr;
            }
        }

        return ans.toString();
    }
}