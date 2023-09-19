package code;

import java.util.Arrays;

public class Solution287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int prev = -1;
        for (int num : nums) {
            if (prev != -1 && prev == num) {
                return num;
            }
            prev = num;
        }
        return -1;
    }
}
