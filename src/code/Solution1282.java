package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1282 {
	public List<List<Integer>> groupThePeople(int[] groupSizes) {
		int[] copyOf = Arrays.copyOf(groupSizes, groupSizes.length);
		Arrays.sort(copyOf);
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> current = new ArrayList<>();
		for (int j : copyOf) {
			if (current.size() < j) {
				current.add(findInitialIndex(j, groupSizes));
				if (current.size() == j) {
					result.add(current);
					current = new ArrayList<>();
				}
			}
		}
		return result;
	}

	private int findInitialIndex(int num, int[] groupSizes) {
		for (int i = 0; i < groupSizes.length; i++) {
			if (groupSizes[i] == num) {
				groupSizes[i] = -1;
				return i;
			}
		}
		return -1;
	}
}
