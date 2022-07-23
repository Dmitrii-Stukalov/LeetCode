package code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution1431 {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> ans = new ArrayList<>();
		int max = Arrays.stream(candies).max().getAsInt();
		for (int candy : candies) {
			ans.add(candy >= max - extraCandies);
		}
		return ans;
	}
}
