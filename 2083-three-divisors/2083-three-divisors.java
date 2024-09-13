class Solution {
    public boolean isThree(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt != n) {
            return false; 
        }
        return isPrime(sqrt);
    }
    
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
