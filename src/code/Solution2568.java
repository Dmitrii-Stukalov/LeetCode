package code;

public class Solution2568 {
	public int minImpossibleOR(int[] nums) {
		boolean[] metPowerOfTwo = new boolean[100];
		for (int num : nums) {
			if ((num & (num - 1)) == 0) {
				metPowerOfTwo[(int) (Math.log(num) / Math.log(2))] = true;
			}
		}
		for (int i = 0; i < metPowerOfTwo.length; i++) {
			if (!metPowerOfTwo[i]) {
				return (int) Math.pow(2, i);
			}
		}
		return -1;
	}
}
