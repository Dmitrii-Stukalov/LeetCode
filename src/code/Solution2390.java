package code;

public class Solution2390 {
	public String removeStars(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '*') {
				if (builder.length() > 0) {
					builder.setLength(builder.length() - 1);
				}
			} else {
				builder.append(s.charAt(i));
			}
		}
		return builder.toString();
	}
}
