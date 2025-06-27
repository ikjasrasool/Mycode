import java.util.Arrays;

class Solution {
    int[][] dp;

    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        dp = new int[m][n];
        
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        int minSum = Integer.MAX_VALUE;
        for (int col = 0; col < n; col++) {
            minSum = Math.min(minSum, helper(matrix, m - 1, col));
        }
        return minSum;
    }

    int helper(int[][] matrix, int row, int col) {
        if (col < 0 || col >= matrix[0].length) return Integer.MAX_VALUE;
        if (row == 0) return matrix[row][col];
        if (dp[row][col] != Integer.MAX_VALUE) return dp[row][col];

        int left = helper(matrix, row - 1, col - 1);
        int up = helper(matrix, row - 1, col);
        int right = helper(matrix, row - 1, col + 1);

        return dp[row][col] = matrix[row][col] + Math.min(up, Math.min(left, right));
    }
}
