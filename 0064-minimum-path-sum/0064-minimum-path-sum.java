class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] db=new int[n][m];
        for(int i=0;i<n;i++)
        {
            Arrays.fill(db[i],-1);
        }
        return dfs(db,grid,0,0);
    }
    int dfs(int[][] db,int[][] mat,int n,int m)
    {
        int rows = mat.length;
        int cols = mat[0].length;
        // Out of bounds
        if (n >= rows || m >= cols) {
            return Integer.MAX_VALUE;
        }
        if (n == rows - 1 && m == cols - 1) {
            return mat[n][m];
        }
        if(db[n][m]!=-1)
        {
            return db[n][m];
        }
        return db[n][m]=mat[n][m]+Math.min(dfs(db,mat,n+1,m),dfs(db,mat,n,m+1));
    }
}