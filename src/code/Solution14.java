package code;

public class Solution14 {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 1) return strs[0];

		StringBuilder stringBuilder = new StringBuilder();
		int minLength = strs[0].length();
		for (String str : strs) {
			if (str.length() < minLength) {
				minLength = str.length();
			}
		}
		out:for (int i = 0; i < minLength; i++) {
			for (int j = 0; j < strs.length - 1; j++) {
				if (strs[j].charAt(i) != strs[j + 1].charAt(i)) {
					break out;
				}
			}
			stringBuilder.append(strs[0].charAt(i));
		}
		return stringBuilder.toString();
	}
}
