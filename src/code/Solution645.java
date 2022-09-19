package code;

public class Solution645 {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        boolean[] flags = new boolean[n];
        int[] ans = new int[2];
        for (int num : nums) {
            if (!flags[num - 1]) {
                flags[num - 1] = true;
            } else {
                ans[0] = num;
            }
        }
        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) {
                ans[1] = i + 1;
                break;
            }
        }
        return ans;
    }
}
