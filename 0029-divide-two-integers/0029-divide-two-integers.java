class Solution {
    public int divide(int dividend, int divisor) {
        int ans = dividend / divisor;

        if(dividend == Integer.MAX_VALUE && divisor == 1){
            ans = Integer.MAX_VALUE;
        }
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            ans = Integer.MAX_VALUE;
        }
        return ans;
    }
}