package code;

import java.util.ArrayList;
import java.util.List;

public class Solution1389 {
	public int[] createTargetArray(int[] nums, int[] index) {
		List<Integer> target = new ArrayList<>(nums.length);
		for (int i = 0; i < nums.length; i++) {
			target.add(index[i], nums[i]);
		}
		return target.stream().mapToInt(num -> num).toArray();
	}
}
