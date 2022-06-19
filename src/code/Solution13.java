package code;

import java.util.HashMap;
import java.util.Map;

public class Solution13 {
	public int romanToInt(String s) {
		Map<Character, Integer> numbers = new HashMap<>();
		numbers.put('I', 1);
		numbers.put('V', 5);
		numbers.put('X', 10);
		numbers.put('L', 50);
		numbers.put('C', 100);
		numbers.put('D', 500);
		numbers.put('M', 1000);
		char[] string = s.toCharArray();
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i != s.length() - 1) {
				if (string[i] == 'I' && string[i + 1] == 'V') {
					res += 4;
					i++;
					continue;
				}
				if (string[i] == 'I' && string[i + 1] == 'X') {
					res += 9;
					i++;
					continue;
				}
				if (string[i] == 'X' && string[i + 1] == 'L') {
					res += 40;
					i++;
					continue;
				}
				if (string[i] == 'X' && string[i + 1] == 'C') {
					res += 90;
					i++;
					continue;
				}
				if (string[i] == 'C' && string[i + 1] == 'D') {
					res += 400;
					i++;
					continue;
				}
				if (string[i] == 'C' && string[i + 1] == 'M') {
					res += 900;
					i++;
					continue;
				}
			}
			res += numbers.get(string[i]);
		}
		return res;
	}
}
