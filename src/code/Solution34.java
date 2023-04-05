package code;

public class Solution34 {
	public int[] searchRange(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		while (l < r) {
			int m = l + (r - l) / 2;
			if (nums[m] == target) {
				while (nums[l] != target) {
					l++;
				}
				while (nums[r] != target) {
					r--;
				}
				return new int[]{l, r};
			}
			if (nums[m] < target) {
				l = m + 1;
			} else {
				r = m - 1;
			}
		}
		if (l < nums.length && target == nums[l]) {
			return new int[]{l, l};
		}
		return new int[]{-1, -1};
	}
}
