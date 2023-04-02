package code;

import java.util.Arrays;

public class Solution2300 {
	public int[] successfulPairs(int[] spells, int[] potions, long success) {
		int n = spells.length;
		int m = potions.length;
		int[] pairs = new int[n];
		Arrays.sort(potions);
		for (int i = 0; i < n; i++) {
			int spell = spells[i];
			int index = findPotion(success % spell == 0 ? success / spell : success / spell + 1, potions);
			pairs[i] = m - index;
		}
		System.out.println(Arrays.toString(pairs));
		return pairs;
	}

	private int findPotion(long target, int[] potions) {
		int l = 0;
		int r = potions.length;
		while (l < r) {
			int m = l + (r - l) / 2;
			if (potions[m] < target) {
				l = m + 1;
			} else {
				r = m;
			}
		}
		return r;
	}
}
