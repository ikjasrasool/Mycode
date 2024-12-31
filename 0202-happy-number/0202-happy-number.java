class Solution {
    public boolean isHappy(int n) {
        do
        {
            n=sum(n);
        }while(n!=1 && n!=4);
        if(n==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int sum(int n){
        int sum = 0;
        while(n > 0){
            sum += (n%10) * (n%10);
            n = n/10;
        }
        return sum;
    }
}