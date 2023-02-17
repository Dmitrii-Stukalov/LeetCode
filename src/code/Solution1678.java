package code;

public class Solution1678 {
	public String interpret(String command) {
		StringBuilder sb = new StringBuilder();
		boolean isPrevBrace = false;
		for (char c : command.toCharArray()) {
			if (c == 'G') {
				sb.append(c);
			} else if (c == '(') {
				isPrevBrace = true;
			} else if (c == 'a' && isPrevBrace) {
				sb.append("al");
				isPrevBrace = false;
			} else if (c == ')' && isPrevBrace) {
				sb.append("o");
				isPrevBrace = false;
			}
		}
		return sb.toString();
	}
}
