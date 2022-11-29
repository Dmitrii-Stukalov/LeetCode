package code;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Solution380 {
    public static class RandomizedSet {
        private final Set<Integer> set;
        private final Random random;

        public RandomizedSet() {
            set = new HashSet<>();
            random = new Random();
        }

        public boolean insert(int val) {
            return set.add(val);
        }

        public boolean remove(int val) {
            return set.remove(val);
        }

        public int getRandom() {
            int i = random.nextInt(set.size());
            for (int key : set) {
                if (i == 0) {
                    return key;
                }
                i--;
            }
            return -1;
        }
    }
}
