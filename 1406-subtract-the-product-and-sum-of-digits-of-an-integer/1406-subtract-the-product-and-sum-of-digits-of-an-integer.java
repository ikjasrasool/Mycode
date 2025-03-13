class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,m=1;
        while(n>0)
        {
            int t=n%10;
            n=n/10;
            s+=t;
            m*=t;
        }
        return m-s;
    }
}