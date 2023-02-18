package code;

public class Solution8 {
	public int myAtoi(String s) {
		String isPositive = "";
		boolean isDigitsMet = false;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			while (!isDigitsMet && i < s.length() && Character.isWhitespace(s.charAt(i))) {
				i++;
			}
			if (i == s.length()) {
				break;
			}
			if (s.charAt(i) == '-') {
				if (!isPositive.isEmpty() || isDigitsMet) {
					break;
				}
				isPositive = "-";
				isDigitsMet = true;
			} else if (s.charAt(i) == '+') {
				if (!isPositive.isEmpty() || isDigitsMet) {
					break;
				}
				isPositive = "+";
				isDigitsMet = true;
			} else if (Character.isDigit(s.charAt(i))) {
				sb.append(s.charAt(i));
				isDigitsMet = true;
			} else {
				break;
			}
		}
		if (sb.length() == 0) {
			return 0;
		}
		int res;
		try {
			res = Integer.parseInt(isPositive + sb);
		} catch (NumberFormatException e) {
			if ("+".equals(isPositive) || isPositive.isEmpty()) {
				return Integer.MAX_VALUE;
			}
			return Integer.MIN_VALUE;
		}
		return res;
	}
}
