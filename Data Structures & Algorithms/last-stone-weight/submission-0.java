class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int v : stones) {
            pq.add(v);
        }

        while (pq.size() > 1) {
            int first = pq.poll();
            int second = pq.poll();

            if (first > second) {
                first -= second;
                pq.add(first);
            } else if (first < second) {
                second -= first;
                pq.add(first);
            }
        }
        
        if (pq.size() == 1) {
            return pq.poll();
        }
        return 0;
    }
}
