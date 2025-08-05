class Solution {
    int[] db=new int[100];
    Solution()
    {
        Arrays.fill(db,-1);
    }
    public int fib(int n) {
        if(n<=1)
        {
            return n;
        }
        if(db[n]!=-1)
        {
            return db[n];
        }
        return db[n]=fib(n-1)+fib(n-2);
    }
}