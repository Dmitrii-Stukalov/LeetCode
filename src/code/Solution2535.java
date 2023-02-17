package code;

public class Solution2535 {
	public int differenceOfSum(int[] nums) {
		int digitSum = 0;
		int elementSum = 0;
		for (int num : nums) {
			elementSum += num;
			digitSum += digitSum(num);
		}
		return elementSum - digitSum;
	}

	private int digitSum(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return sum;
	}
}
