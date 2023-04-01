package code;

public class Solution704 {
	public int search(int[] nums, int target) {
		int l = 0;
		int r = nums.length;
		while (l < r) {
			int m = (l + r) / 2;
			if (nums[m] < target) {
				l = m + 1;
			} else if (nums[m] > target) {
				r = m;
			} else {
				return m;
			}
		}
		return -1;
	}
}
