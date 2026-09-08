class KthLargest {
    private int k;
    private PriorityQueue<Integer> pq;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int n : nums) {
            pq.add(n);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        Deque<Integer> stack = new ArrayDeque<>();
        
        for (int i = 0; i < k; i++) {
            stack.push(pq.poll());
        }
        int solution = stack.peek();
        while (stack.size() != 0) {
            pq.add(stack.pop());
        }
        return solution;
    }
}
