package code;

import java.util.TreeSet;

public class Solution2336 {
    public static class SmallestInfiniteSet {
        private final TreeSet<Integer> set;
        private int currentMin;

        public SmallestInfiniteSet() {
            set = new TreeSet<>();
            currentMin = 1;
        }

        public int popSmallest() {
            if (set.isEmpty()) {
                return currentMin++;
            }
            Integer min = set.pollFirst();
            return min != null ? min : 0;
        }

        public void addBack(int num) {
            if (num < currentMin) {
                set.add(num);
            }
        }
    }
}
