package code;

import java.util.ArrayList;
import java.util.List;

public class Solution2610 {
    public List<List<Integer>> findMatrix(int[] nums) {
        int n = nums.length;
        boolean[] used = new boolean[n];
        int counter = 0;
        List<List<Integer>> ans = new ArrayList<>();
        while (counter != n) {
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (!used[i] && !row.contains(nums[i])) {
                    used[i] = true;
                    row.add(nums[i]);
                    counter++;
                }
            }
            ans.add(row);
        }
        return ans;
    }
}
