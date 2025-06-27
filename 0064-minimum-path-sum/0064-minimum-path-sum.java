class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] db=new int[m][n];
        db[0][0]=grid[0][0];
        for(int i=1;i<m;i++)
        {
            db[i][0]=grid[i][0]+db[i-1][0];
        }
        for(int i=1;i<n;i++)
        {
            db[0][i]=grid[0][i]+db[0][i-1];
        }
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                db[i][j]=grid[i][j]+Math.min(db[i-1][j],db[i][j-1]);
            }
        }
        return db[m-1][n-1];
    }
}