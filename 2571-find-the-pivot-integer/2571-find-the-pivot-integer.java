class Solution {
    public int pivotInteger(int n) {
        int f_part, s_part;
        int total = (n * (n + 1)) / 2;// Calculate sum of n numbers
        for (int i = 1; i <= n; i++) {
            f_part = (i * (i + 1)) / 2;// calculate sum till ith term
            s_part = total + i;
            if (s_part / 2.0 == f_part)
                return i;
        }
        return -1;
    }
}