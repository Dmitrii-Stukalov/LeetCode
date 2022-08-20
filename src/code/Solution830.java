package code;

import java.util.ArrayList;
import java.util.List;

public class Solution830 {
	public List<List<Integer>> largeGroupPositions(String s) {
		int currentLength = 1;
		int startIndex = 0;
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i - 1) == s.charAt(i)) {
				currentLength++;
			} else {
				if (currentLength > 2) {
					ans.add(List.of(startIndex, i - 1));
				}
				currentLength = 1;
				startIndex = i;
			}
		}
		if (currentLength > 2) {
			ans.add(List.of(startIndex, s.length() - 1));
		}
		return ans;
	}
}
