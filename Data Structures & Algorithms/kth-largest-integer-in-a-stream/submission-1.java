class KthLargest {
    private int k;
    private List<Integer> pq;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new ArrayList<>();
        for (int n : nums) {
            pq.add(n);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        Collections.sort(pq);
        return pq.get(pq.size() - k);
    }
}
