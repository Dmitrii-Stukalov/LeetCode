package code;

import java.util.HashMap;
import java.util.Map;

public class Solution205 {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) return false;
		Map<Character, Character> charactersMapping = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
			Character mappedCharacter = charactersMapping.get(sChar);
			if (mappedCharacter != null && mappedCharacter != tChar) {
				return false;
			}
			if (mappedCharacter == null && charactersMapping.containsValue(tChar)) {
				return false;
			}
			charactersMapping.putIfAbsent(sChar, tChar);
		}
		return true;
	}
}
