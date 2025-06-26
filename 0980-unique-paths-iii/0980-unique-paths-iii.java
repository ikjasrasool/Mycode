class Solution {
    private int result = 0;
    private int emptySquares = 0;
    public int uniquePathsIII(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int srow=0,scol=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    srow=i;
                    scol=j;
                }
                else if(grid[i][j]==0)
                {
                    emptySquares++;
                }
            }
        }
        dfs(grid, srow, scol, emptySquares + 1);
        return result;
    }
    private void dfs(int[][] grid, int row, int col, int remain) {
    
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length|| grid[row][col] == -1) 
            return;
        if(grid[row][col]==2)
        {
            if (remain == 0) result++;
            return;
        }
        
        int temp = grid[row][col];
        grid[row][col] = -1;

        dfs(grid, row + 1, col, remain - 1);
        dfs(grid, row - 1, col, remain - 1);
        dfs(grid, row, col + 1, remain - 1);
        dfs(grid, row, col - 1, remain - 1);

    
        grid[row][col] = temp;

    
    }
}