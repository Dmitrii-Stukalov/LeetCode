package code;

import java.util.HashMap;
import java.util.Map;

public class Solution383 {
	public boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> source = new HashMap<>();
		for (char c : magazine.toCharArray()) {
			source.putIfAbsent(c, 0);
			source.put(c, source.get(c) + 1);
		}
		for (char c : ransomNote.toCharArray()) {
			Integer integer = source.getOrDefault(c, 0);
			if (integer == 0) {
				return false;
			}
			integer--;
			source.put(c, integer);
		}
		return true;
	}
}
