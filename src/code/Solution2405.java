package code;

import java.util.HashSet;
import java.util.Set;

public class Solution2405 {
	public int partitionString(String s) {
		Set<Character> currentChars = new HashSet<>();
		int ans = 1;
		for (char c : s.toCharArray()) {
			if (!currentChars.add(c)) {
				currentChars.clear();
				currentChars.add(c);
				ans++;
			}
		}
		return ans;
	}
}
