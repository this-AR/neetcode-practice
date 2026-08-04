class Solution {
    public int minMeetingRooms(List<Interval> intervals) {

        if (intervals.size() == 0)
            return 0;

        intervals.sort((a, b) -> a.start - b.start);

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (Interval in : intervals) {

            if (!pq.isEmpty() && pq.peek() <= in.start)
                pq.poll();

            pq.offer(in.end);
        }

        return pq.size();
    }
}