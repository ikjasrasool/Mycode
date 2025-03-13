class Solution {
    public int numWaterBottles(int n, int e) {
        int d=n;
        while(n>=e)
        {
            int x=(n/e);
            d=d+x;
            int r=n%e;
            n=x+r;
        }
        return d;
    }
}