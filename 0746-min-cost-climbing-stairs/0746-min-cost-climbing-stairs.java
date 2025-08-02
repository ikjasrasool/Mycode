class Solution {
    int[] dp;
    public int fun(int n,int[] cost)
    {
        if(n<=1)
        {
            return cost[n];
        }
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        return dp[n]=cost[n]+Math.min(fun(n-1,cost),fun(n-2,cost));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        dp=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(fun(n-1,cost),fun(n-2,cost));
    }
}