package code;

import java.util.ArrayList;
import java.util.List;

public class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean rowReversed = false;
        boolean colReversed = false;
        int startRow = 0;
        int startCol = 0;
        int endRow = rows - 1;
        int endCol = cols - 1;
        while (ans.size() < rows * cols) {
            if (!rowReversed) {
                for (int i = startCol; i < endCol + 1; i++) {
                    ans.add(matrix[startRow][i]);
                }
                startRow++;
                rowReversed = true;
            } else {
                for (int i = endCol; i > startCol - 1; i--) {
                    ans.add(matrix[endRow][i]);
                }
                endRow--;
                rowReversed = false;
            }
            if (!colReversed) {
                for (int i = startRow; i < endRow + 1; i++) {
                    ans.add(matrix[i][endCol]);
                }
                endCol--;
                colReversed = true;
            } else {
                for (int i = endRow; i > startRow - 1; i--) {
                    ans.add(matrix[i][startCol]);
                }
                startCol++;
                colReversed = false;
            }
        }
        return ans;
    }
}
