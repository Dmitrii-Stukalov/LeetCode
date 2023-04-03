package code;

import java.util.Arrays;

public class Solution881 {
	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int i = 0;
		int j = people.length - 1;
		int ans = 0;
		while (i <= j) {
			if (people[i] + people[j] <= limit) {
				i++;
			}
			ans++;
			j--;
		}
		return ans;
	}
}
