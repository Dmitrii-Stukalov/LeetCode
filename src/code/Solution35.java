package code;

public class Solution35 {
	public int searchInsert(int[] nums, int target) {
		int l = 0;
		int r = nums.length - 1;
		while (l < r) {
			int m = (l + r) / 2;
			if (nums[m] == target) {
				return m;
			}
			if (nums[m] < target) {
				l = m + 1;
			} else {
				r = m;
			}
		}
		return nums[l] < target ? l + 1 : l;
	}
}
