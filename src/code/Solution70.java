package code;

public class Solution70 {
    public int climbStairs(int n) {
        if (n < 4) return n;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            if (i < 3) {
                ans[i] = i + 1;
            } else {
                ans[i] = ans[i - 2] + ans[i - 1];
            }
        }
        return ans[n - 1];
    }
}
