package code;

import java.util.Arrays;

public class Solution1608 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (nums[m] >= nums.length - m) {
                if (m == 0 || nums[m - 1] < nums.length - m) {
                    return nums.length - m;
                } else {
                    r = m;
                }
            } else {
                l = m + 1;
            }
        }
        return -1;
    }
}
