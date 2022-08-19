package code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution1255 {
	public int maxScoreWords(String[] words, char[] letters, int[] score) {
		Map<Character, Integer> initialMap = new HashMap<>();
		for (char letter : letters) {
			initialMap.merge(letter, 1, Integer::sum);
		}

		int ans = 0;
		for (List<String> subset : getAllSubsets(words)) {
			int temp = calculatePrices(subset, initialMap, score);
			if (temp > ans) {
				ans = temp;
			}
		}

		return ans;
	}

	private List<List<String>> getAllSubsets(String[] words) {
		int n = words.length;
		List<List<String>> subsets = new ArrayList<>();
		for (int i = 0; i < (1 << n); i++) {
			List<String> subset = new ArrayList<>();
			for (int j = 0; j < n; j++) {
				if ((i & (1 << j)) > 0) {
					subset.add(words[j]);
				}
			}
			subsets.add(subset);
		}
		return subsets;
	}

	private int calculatePrices(List<String> words, Map<Character, Integer> initialMap, int[] score) {
		Map<Character, Integer> map = new HashMap<>(initialMap);
		int totalPrice = 0;
		for (String word : words) {
			int price = 0;
			for (char c : word.toCharArray()) {
				if (map.getOrDefault(c, 0) > 0) {
					price += score[c - 'a'];
					map.merge(c, -1, Integer::sum);
				} else {
					price = 0;
					break;
				}
			}
			totalPrice += price;
		}

		return totalPrice;
	}
}
