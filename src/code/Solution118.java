package code;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(List.of(1));
        if (numRows == 1) {
            return ans;
        }
        ans.add(List.of(1, 1));
        if (numRows == 2) {
            return ans;
        }
        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i - 1; j++) {
                row.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j + 1));
            }
            row.add(1);
            ans.add(row);
        }
        return ans;
    }
}
