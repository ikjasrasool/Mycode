class Solution {
    public int check(int [] piles,int hour)
    {
        int speed=0;
        for(int x:piles)
        {
            speed+=Math.ceil((double)x/hour);//(x/hour)+(x%hour==0)
        }
        return speed;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int x:piles)
        {
            high=Math.max(x,high);
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(check(piles,mid)>h)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
}