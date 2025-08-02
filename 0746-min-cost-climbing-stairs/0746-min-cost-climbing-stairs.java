class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f=cost[0];
        int s=cost[1];
        int n=cost.length;
        if(n<2)
        {
            return Math.min(f,s);
        }
        for(int i=2;i<n;i++)
        {
            int c=cost[i]+Math.min(f,s);
            f=s;
            s=c;
        }
        return Math.min(f,s);
    }
}