import java.util.Arrays;

class Solution {
    int[][] dp;

    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        dp = new int[n][n];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        int min = Integer.MAX_VALUE;
        for (int col = 0; col < n; col++) {
            min = Math.min(min, helper(matrix, n - 1, col));
        }
        return min;
    }

    int helper(int[][] matrix, int row, int col) {
        if (col < 0 || col >= matrix.length) return Integer.MAX_VALUE;
        if (row == 0) return matrix[0][col];
        if (dp[row][col] != -1) return dp[row][col];

        int minAbove = Integer.MAX_VALUE;
        for (int j = 0; j < matrix.length; j++) {
            if (j == col) continue;
            minAbove = Math.min(minAbove, helper(matrix, row - 1, j));
        }

        return dp[row][col] = matrix[row][col] + minAbove;
    }
}
