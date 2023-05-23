package code;

import java.util.*;

public class Solution347 {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        TreeMap<Integer, List<Integer>> freqMap = new TreeMap<>();
        for (int num : map.keySet()) {
            int freq = map.get(num);
            if (!freqMap.containsKey(freq)) {
                freqMap.put(freq, new LinkedList<>());
            }
            freqMap.get(freq).add(num);
        }

        int[] res = new int[k];
        int i = 0;
        while (i < k) {
            Map.Entry<Integer, List<Integer>> entry = freqMap.pollLastEntry();
            for (var num : entry.getValue()) {
                res[i] = num;
                i++;
            }
        }
        return res;
    }
}
