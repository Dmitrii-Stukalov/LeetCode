package code;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution451 {
    public String frequencySort(String s) {
        Map<String, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.merge(String.valueOf(c), 1, Integer::sum);
        }

        Map<String, Integer> mp = map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.<String, Integer>comparingByValue())
                        .thenComparing(Map.Entry.comparingByKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (newValue, oldValue) -> oldValue, LinkedHashMap::new));

        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            result.append(entry.getKey().repeat(Math.max(0, entry.getValue())));
        }

        return result.toString();
    }
}
