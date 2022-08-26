package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution869 {
	public boolean reorderedPowerOf2(int n) {
		int product = 1;
		List<Integer> powersOfTwo = new ArrayList<>();
		while (product <= Math.pow(10, 9)) {
			powersOfTwo.add(product);
			product *= 2;
		}
		List<Map<Character, Integer>> digitsAmount = countDigits(powersOfTwo);
		Map<Character, Integer> givenDigits = countDigits(n);
		return digitsAmount.stream().anyMatch(map -> map.equals(givenDigits));
	}

	private List<Map<Character, Integer>> countDigits(List<Integer> powersOfTwo) {
		List<Map<Character, Integer>> result = new ArrayList<>();
		for (Integer powerOfTwo : powersOfTwo) {
			result.add(countDigits(powerOfTwo));
		}
		return result;
	}

	private Map<Character, Integer> countDigits(Integer powerOfTwo) {
		Map<Character, Integer> map = new HashMap<>();
		for (char digit : powerOfTwo.toString().toCharArray()) {
			map.merge(digit, 1, Integer::sum);
		}
		return map;
	}
}
