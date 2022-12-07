package code;

public class Solution1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            for (int num : nums) {
                if (nums[i] > num) {
                    res[i]++;
                }
            }
        }
        return res;
    }
}
