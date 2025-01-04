class Solution {
    public String baseNeg2(int n) {
        if(n==0)
        {
            return "0";
        }
        String result = "";
        while (n != 0) {
            result =Math.abs(n % -2) + result;
            if (n > 0) {
                n /= -2;
            } else {
                // n = Int(ceil(Double(n) / -2))
                n = (n - 1) / -2;
            }
        }
        return result;
    }
}