class Solution 
{
    public int uniquePaths(int m, int n)
    {
        int[] a=new int[n];
        Arrays.fill(a,1);
        for(int i=1;i<m;i++)
        {
            int[] b=new int[n];
            Arrays.fill(b,1);
            for(int j=1;j<n;j++)
            {
                b[j]=b[j-1]+a[j];
            }
            a=b;
        }
        return a[n-1];
    }
}