package code;

public class Solution931 {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        if (n == 1) {
            return matrix[0][0];
        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    matrix[i][j] += Math.min(matrix[i - 1][j], matrix[i - 1][j + 1]);
                } else if (j == n - 1) {
                    matrix[i][j] += Math.min(matrix[i - 1][j], matrix[i - 1][j - 1]);
                } else {
                    matrix[i][j] += Math.min(Math.min(matrix[i - 1][j], matrix[i - 1][j - 1]), matrix[i - 1][j + 1]);
                }
                if (i == n - 1 && min > matrix[i][j]) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }
}
