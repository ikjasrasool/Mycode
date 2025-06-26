import java.util.Arrays;

class Solution {
    int[] db = new int[100];
    
    Solution() {
        Arrays.fill(db, -1);
    }
    
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (db[n] != -1) {
            return db[n];
        }
        return db[n] = climbStairs(n - 1) + climbStairs(n - 2);
    }
}
