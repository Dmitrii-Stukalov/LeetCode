package code;

public class Solution2256 {
    public int minimumAverageDifference(int[] nums) {
        int n = nums.length;
        long[] firstSums = new long[n];
        long[] lastSums = new long[n];
        firstSums[0] = nums[0];
        lastSums[0] = 0;
        for (int i = 1, j = n - 1; i < n; i++, j--) {
            firstSums[i] = firstSums[i - 1] + nums[i];
            lastSums[i] = lastSums[i - 1] + nums[j];
        }
        int min = Integer.MAX_VALUE;
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            int averageDifference = (int) Math.abs(firstSums[i] / (i + 1) - lastSums[n - 1 - i] / (n - i - 1));
            if (averageDifference < min) {
                min = averageDifference;
                res = i;
            }
        }
        if (min > Math.abs(firstSums[n - 1] / n))
            return n - 1;
        return res;
    }
}
