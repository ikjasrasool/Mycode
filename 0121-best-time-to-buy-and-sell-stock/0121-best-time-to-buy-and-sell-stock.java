class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int buy = prices[0], max_profit = 0;
        for (int i = 1; i < n; i++) {
            if (buy > prices[i])
                buy = prices[i];
            max_profit =Math.max(prices[i] - buy,max_profit);
        }
        return max_profit;
    }
}