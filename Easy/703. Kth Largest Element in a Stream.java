/*
Problem Name: 703. Kth Largest Element in a Stream
Problem Link: https://leetcode.com/problems/kth-largest-element-in-a-stream/
*/
class KthLargest {
    int k;
    PriorityQueue<Integer> pq;
    public KthLargest(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<Integer>();
        for(int i:nums)
            add(i);
    }
    
    public int add(int val) {
        pq.add(val);
        if(pq.size() > k)
            pq.remove();
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
