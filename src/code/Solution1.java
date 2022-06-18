package code;

import java.util.HashMap;
import java.util.Map;

public class Solution1 {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer fromMap = map.get(target - nums[i]);
			if (fromMap != null) {
				return new int[]{fromMap, i};
			}
			map.put(nums[i], i);
		}
		return new int[]{0, 0};
	}
}
