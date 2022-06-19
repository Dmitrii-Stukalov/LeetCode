package code;

public class Solution35 {
	public int searchInsert(int[] nums, int target) {
		int left = 0;
		int right = nums.length;
		int prev_mid = -1;
		while (left < right) {
			int mid = (right + left) / 2;
			if (prev_mid == mid) {
				if (nums[mid] > target) {
					return mid;
				} else {
					return mid + 1;
				}
			}
			if (nums[mid] > target) {
				right = mid;
				prev_mid = mid;
				continue;
			}
			if (nums[mid] < target) {
				left = mid;
				prev_mid = mid;
				continue;
			}
			return mid;
		}
		if (nums[prev_mid] > target) {
			return prev_mid;
		} else {
			return prev_mid + 1;
		}
	}
}
