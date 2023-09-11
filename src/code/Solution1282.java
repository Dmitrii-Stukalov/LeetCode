package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class Solution1282 {
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
		List<List<Integer>> result = new ArrayList<>();
		Map<Integer, List<Integer>> groups = new HashMap<>();
		for (int i = 0; i < groupSizes.length; i++) {
			int size = groupSizes[i];
			List<Integer> group = groups.getOrDefault(size, new ArrayList<>());
			group.add(i);
			if (group.size() == size) {
				result.add(group);
				groups.put(size, new ArrayList<>());
			} else {
				groups.put(size, group);
			}
		}
		return result;
	}
}
