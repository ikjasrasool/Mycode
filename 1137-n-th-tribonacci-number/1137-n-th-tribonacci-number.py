class Solution:
    def tribonacci(self, n: int) -> int:
        a = 0 
        b = 1
        c = 1
        if n == 0 or n == 1:
            return n
        if n == 2:
            return 1
        for i in range(3,n+1):
            ans = a+b+c
            a=b
            b=c
            c = ans
        return c