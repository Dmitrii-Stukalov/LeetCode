package code;

public class Solution1108 {
	public String defangIPaddr(String address) {
		StringBuilder stringBuilder = new StringBuilder();
		int lastDot = 0;
		for (int i = 0; i < address.length(); i++) {
			if (address.charAt(i) == '.') {
				stringBuilder.append(address, lastDot, i);
				stringBuilder.append("[.]");
				lastDot = i + 1;
			}
		}
		return stringBuilder.append(address.substring(lastDot)).toString();
	}
}
