package code;

import java.util.HashMap;
import java.util.Map;

public class Solution659 {
	public boolean isPossible(int[] nums) {
		Map<Integer, Integer> firstMap = new HashMap<>();
		Map<Integer, Integer> secondMap = new HashMap<>();
		for (int num : nums) {
			firstMap.merge(num, 1, Integer::sum);
		}

		for (int num : nums) {
			if (firstMap.get(num) < 1) {
				continue;
			}
			if (secondMap.getOrDefault(num, 0) > 0) {
				firstMap.merge(num, -1, Integer::sum);
				secondMap.merge(num, -1, Integer::sum);
				secondMap.merge(num + 1, 1, Integer::sum);
			} else if (firstMap.getOrDefault(num, 0) > 0
					&& firstMap.getOrDefault(num + 1, 0) > 0
					&& firstMap.getOrDefault(num + 2, 0) > 0) {
				firstMap.merge(num, -1, Integer::sum);
				firstMap.merge(num + 1, -1, Integer::sum);
				firstMap.merge(num + 2, -1, Integer::sum);

				secondMap.merge(num + 3, 1, Integer::sum);
			} else {
				return false;
			}
		}
		return true;
	}
}
