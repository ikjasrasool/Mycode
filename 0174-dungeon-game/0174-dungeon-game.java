import java.util.Arrays;

class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int n = dungeon.length;
        int m = dungeon[0].length;

        int[][] dp = new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, 0);
        }

        return helper(dungeon, n, m, 0, 0, dp);
    }

    private int helper(int[][] dungeon, int n, int m, int row, int col, int[][] dp) {
        // base condition 1
        if (row == n - 1 && col == m - 1) {
            return Math.max(1, 1 - dungeon[row][col]);
        }

        // base condition 2
        if (row >= n || col >= m) {
            return Integer.MAX_VALUE;
        }

        if (dp[row][col] != 0) {
            return dp[row][col];
        }

        int right = helper(dungeon, n, m, row, col + 1, dp);
        int down = helper(dungeon, n, m, row + 1, col, dp);

        // Calculate the minimum health needed at the current position
        dp[row][col] = Math.max(1, Math.min(right, down) - dungeon[row][col]);

        return dp[row][col];
    }
}