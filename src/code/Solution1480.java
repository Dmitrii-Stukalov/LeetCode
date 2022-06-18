package code;

public class Solution1480 {
	public int[] runningSum(int[] nums) {
		int accumulator = 0;
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			accumulator += nums[i];
			result[i] = accumulator;
		}
		return result;
	}
}
