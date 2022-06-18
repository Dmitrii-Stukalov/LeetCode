package code;

public class Solution724 {
	public int pivotIndex(int[] nums) {
		int leftSum;
		int rightSum;
		for (int i = 0; i < nums.length; i++) {
			leftSum = leftSum(nums, i);
			rightSum = rightSum(nums, i);
			if (leftSum == rightSum) {
				return i;
			}
		}
		return -1;
	}

	private int rightSum(int[] array, int index) {
		int sum = 0;
		for (int i = index + 1; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	private int leftSum(int[] array, int index) {
		int sum = 0;
		for (int i = 0; i < index; i++) {
			sum += array[i];
		}
		return sum;
	}
}
