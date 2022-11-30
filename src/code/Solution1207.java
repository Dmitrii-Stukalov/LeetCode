package code;

import java.util.HashMap;
import java.util.Map;

public class Solution1207 {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurrences = new HashMap<>();
        for (int number : arr) {
            occurrences.merge(number, 1, Integer::sum);
        }
        return occurrences.values().stream().distinct().count() == occurrences.keySet().size();
    }
}
