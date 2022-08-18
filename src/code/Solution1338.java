package code;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution1338 {
	public int minSetSize(int[] arr) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int num : arr) {
			map.merge(num, 1, Integer::sum);
		}
		Map<Integer, Integer> sortedMap = map
				.entrySet()
				.stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		int ans = 0;
		int removedElements = 0;
		for (var entry : sortedMap.entrySet()) {
			if (removedElements >= arr.length / 2) {
				return ans;
			}
			removedElements += entry.getValue();
			ans++;
		}
		return ans;
	}
}
