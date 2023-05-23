package code;

import java.util.PriorityQueue;

public class Solution703 {
    public static class KthLargest {
        private final int k;
        private final PriorityQueue<Integer> q;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            q = new PriorityQueue<>(k);
            for (int num : nums) {
                add(num);
            }
        }

        @SuppressWarnings("DataFlowIssue")
        public int add(int val) {
            if (q.size() < k) {
                q.add(val);
            } else if (q.peek() < val) {
                q.poll();
                q.add(val);
            }
            return q.peek();
        }
    }
}
