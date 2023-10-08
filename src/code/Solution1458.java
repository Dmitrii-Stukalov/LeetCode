package code;

public class Solution1458 {
    private int[][] memo;
    private int[] nums1;
    private int[] nums2;

    public int maxDotProduct(int[] nums1, int[] nums2) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : nums1) {
            firstMax = Math.max(firstMax, num);
            firstMin = Math.min(firstMin, num);
        }

        for (int num : nums2) {
            secondMax = Math.max(secondMax, num);
            secondMin = Math.min(secondMin, num);
        }

        if (firstMax < 0 && secondMin > 0) {
            return firstMax * secondMin;
        }

        if (secondMax < 0 && firstMin > 0) {
            return secondMax * firstMin;
        }
        memo = new int[nums1.length][nums2.length];
        this.nums1 = nums1;
        this.nums2 = nums2;
        return dp(0, 0);
    }

    private int dp(int i, int j) {
        if (i == nums1.length || j == nums2.length) {
            return 0;
        }

        if (memo[i][j] != 0) {
            return memo[i][j];
        }

        int use = nums1[i] * nums2[j] + dp(i + 1, j + 1);
        memo[i][j] = Math.max(use, Math.max(dp(i + 1, j), dp(i, j + 1)));
        return memo[i][j];
    }
}