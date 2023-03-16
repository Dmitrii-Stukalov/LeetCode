package code;

public class Solution2574 {
	public int[] leftRigthDifference(int[] nums) {
		int n = nums.length;
		int[] answer = new int[n];
		int[] leftSum = new int[n];
		leftSum[0] = 0;
		int[] rightSum = new int[n];
		rightSum[n - 1] = 0;
		for (int i = 1; i < n; i++) {
			leftSum[i] = leftSum[i - 1] + nums[i - 1];
			rightSum[n - i - 1] = rightSum[n - i] + nums[n - i];
		}
		for (int i = 0; i < n; i++) {
			answer[i] = Math.abs(leftSum[i] - rightSum[i]);
		}
		return answer;
	}
}
