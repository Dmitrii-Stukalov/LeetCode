package code;

public class Solution1491 {
	public double average(int[] salary) {
		int sum = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int num : salary) {
			sum += num;
			if (num < min) {
				min = num;
			}
			if (num > max) {
				max = num;
			}
		}
		sum -= min;
		sum -= max;
		return ((double) sum) / (salary.length - 2);
	}
}
