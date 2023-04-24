package code;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution1046 {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) {
            queue.add(stone);
        }
        while (queue.size() > 1) {
            Integer max = queue.poll();
            Integer max2 = queue.poll();
            if (max2 != null && !max2.equals(max)) {
                queue.add(max - max2);
            }
        }
        return queue.size() == 0 ? 0 : queue.peek();
    }
}
